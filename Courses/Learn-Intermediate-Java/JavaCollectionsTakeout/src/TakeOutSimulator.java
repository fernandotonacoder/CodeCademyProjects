import java.util.Scanner;

public class TakeOutSimulator {

    private Customer customer;
    private FoodMenu menu;
    private Scanner input;
    private IntUserInputRetriever intUserInputRetriever;
    private IllegalArgumentException illegalArgumentException;


    public TakeOutSimulator(Customer customer, Scanner input) {
        this.customer = customer;
        this.input = input;
        menu = new FoodMenu();
    }


    public void startTakeOutSimulator() {
        boolean customerSimulating = true;

        while (true) {
            System.out.println("");
            System.out.println("Hello " + customer.getName() + ", Welcome to my restaurant!");
            takeOutPrompt();
            if (shouldSimulate() == false) {
                break;
            }
            return;
        }
    }


    private <T> T getOutputOnIntInput(String userInputPrompt, IntUserInputRetriever intUserInputRetriever) throws IllegalArgumentException {
                System.out.println(userInputPrompt);
                int selection = input.nextInt();
                if (!input.hasNextInt()) {
                    System.out.println("Your input isn't valid. It needs to be an `int` type. Try again");
                    getOutputOnIntInput(userInputPrompt, intUserInputRetriever);
            }
        return (T) intUserInputRetriever.produceOutputOnIntUserInput(selection);
        }

    public boolean shouldSimulate() {
        String userPrompt = "Enter 1 to CONTINUE simulation or 0 to EXIT program: ";

        IntUserInputRetriever<Boolean> intUserInputRetriever = (int selection) -> {
            if (selection == 1 && customer.getMoney() >= menu.getLowestCostFood().getPrice()) {
                return true;
            } else if (selection == 1 && customer.getMoney() <= menu.getLowestCostFood().getPrice()) {
                System.out.println("You don't have enough money to continue shopping :( - ending simulation...");
                return false;
            } else if (selection == 0) {
                System.out.println("Bye bye! Come again soon!");
                return false;
            } else {
                throw illegalArgumentException;
            }
        };
        getOutputOnIntInput(userPrompt, intUserInputRetriever);
        return intUserInputRetriever.produceOutputOnIntUserInput(input.nextInt());
    }


    public Food getMenuSelection() {
        String userPrompt = "Today's Menu Options! \n" +
                menu.toString();
        IntUserInputRetriever <Food> intUserInputRetriever = (int selection) -> {
            if (menu.getFood(selection) == null) {
                throw illegalArgumentException;
            }
            return menu.getFood(selection);
        };
        return getOutputOnIntInput(userPrompt, intUserInputRetriever);
    }


    public boolean isStillOrderingFood() {
        String userPrompt = "Enter 1 to CONTINUE shopping or 0 to CHECKOUT: ";
        IntUserInputRetriever intUserInputRetriever = (int selection) -> {
            if (selection == 1) {
                return true;
            } else if (selection == 0) {
                return false;
            } else {
                throw illegalArgumentException;
            }
        };
        return getOutputOnIntInput(userPrompt, intUserInputRetriever);
    }


    public void checkoutCustomer(ShoppingBag<Food> shoppingBag) {
        System.out.println("Processing payment...");

        customer.setMoney(customer.getMoney() - shoppingBag.getTotalPrice());
        System.out.println("Your remaining money is: €" + customer.getMoney());
        System.out.println("Thanks for your purchase. Enjoy your meal!");
    }


    public void takeOutPrompt() {
        ShoppingBag<Food> shoppingBag = new ShoppingBag<>();
        int customerMoneyLeft = customer.getMoney();
        boolean ordering = true;

            while (ordering){
            System.out.println("");
            System.out.println("You have " + customerMoneyLeft + "€ left to spend.\n" +
                    "");

            Food selectedFood = getMenuSelection();
            System.out.println("You've chosen: " + selectedFood);

            if (customerMoneyLeft >= selectedFood.getPrice()) {
                customerMoneyLeft -= selectedFood.getPrice();
                shoppingBag.addItem(selectedFood);
                System.out.println("Now you have €" + customerMoneyLeft + " currently available.");
            } else {
                System.out.println("Oops! Looks like you don't have enough for that. Do you want to check for another food? (yes/no)");
                if (input.next() == "no") {
                    System.out.println("Hope to see you again soon!");
                } else if (input.next() == "yes")
                    takeOutPrompt();
            }

            isStillOrderingFood();
            }
        }
    }
