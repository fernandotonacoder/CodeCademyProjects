import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class TakeOutSimulator {

    private Customer customer;
    private FoodMenu menu;
    private Scanner input;
    private ShoppingBag<Food> shoppingBag;

    public TakeOutSimulator(Customer customer, Scanner input) {
        this.customer = customer;
        this.input = input;
        menu = new FoodMenu();
    }

    public void startTakeOutSimulator() {

        while (true) {
            System.out.println("");
            System.out.println("Hello " + customer.getName() + ", Welcome to my restaurant!");
            takeOutPrompt();
        }
    }

    private <T> T getOutputOnIntInput(String userInputPrompt, IntUserInputRetriever intUserInputRetriever) {
        while (true) {
            try {
                System.out.println(userInputPrompt);
                int selection = input.nextInt();
                    return (T) intUserInputRetriever.produceOutputOnIntUserInput(selection);

            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Your input isn't valid. It needs to be an `int` type. Try again");
                input = new Scanner(System.in);
            }
        }
    }

    public boolean shouldSimulate() {
        String userPrompt = "[Enter 1 to RESUME or 0 to EXIT program: ]";
        IntUserInputRetriever intUserInputRetriever = (int selection) -> {
            if (selection == 1 && customer.getMoney() >= menu.getLowestCostFood().getPrice()) {
                return true;
            } else if (selection == 1 && customer.getMoney() <= menu.getLowestCostFood().getPrice()) {
                System.out.println("You don't have enough money to continue shopping :( - ending simulation...");
                return false;
            } else if (selection == 0) {
                System.out.println("Bye bye! Come again soon!");
                return false;
            } else {
                System.out.println("Invalid selection. Please try again");
                return shouldSimulate();
            }
        };
        return getOutputOnIntInput(userPrompt, intUserInputRetriever);
    }

    public Food getMenuSelection() {
        String userPrompt = "\n" +
                "You have €" + customer.getMoney() + " left.\n" +
                "Today's Menu Options! (select option number) \n" +
                menu.toString() +"\n"+
                "[Enter 0 to CHECKOUT or 100 to EXIT]";
        IntUserInputRetriever intUserInputRetriever = (int selection) -> {
            while (true) {
                if (selection == 0){
                    checkoutCustomer(shoppingBag);
                }
                if (selection == 100) {
                    if (!shouldSimulate()){
                        System.exit(0);
                    }
                }
                menu.getFood(selection);
                if (menu.getFood(selection) == null) {
                    System.out.println("Invalid selection. Choose one from the options available below\n" +
                            "");
                    System.out.println(userPrompt);
                    selection = input.nextInt();
                } else {
                    return menu.getFood(selection);
                }
            }
        };
        return getOutputOnIntInput(userPrompt, intUserInputRetriever);
    }

    public boolean isStillOrderingFood() {
        String userPrompt = "[Enter 1 to CONTINUE shopping or 0 to CHECKOUT]";
        IntUserInputRetriever intUserInputRetriever = (int selection) -> {
            if (selection == 1) {
                return true;
            } else if (selection == 0) {
                return false;
            } else {
                System.out.println("Invalid selection. Try again.");
                return isStillOrderingFood();
            }
        };
        return getOutputOnIntInput(userPrompt, intUserInputRetriever);
    }

    public void checkoutCustomer(ShoppingBag<Food> shoppingBag) {
        if (shoppingBag.getTotalPrice() == 0) {
            System.out.println("Your cart is empty");
            try{Thread.sleep(1600);}catch(InterruptedException e){System.out.println(e);}
            System.out.println("Hope we have something that pleases you for the next time");
            try{Thread.sleep(2000);}catch(InterruptedException e){System.out.println(e);}
            System.out.println("Come again soon!");
            try{Thread.sleep(1600);}catch(InterruptedException e){System.out.println(e);}
            System.exit(0);
        }
        System.out.println("Processing payment...");
        customer.setMoney(customer.getMoney() - shoppingBag.getTotalPrice());
        try{Thread.sleep(1500);}catch(InterruptedException e){System.out.println(e);}
        System.out.println("Your remaining money is: €" + customer.getMoney());
        try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
        System.out.println("Thanks for your purchase, enjoy your meal and...");
        try{Thread.sleep(1500);}catch(InterruptedException e){System.out.println(e);}
        System.out.println("HOPE TO SEE YOU SOON!\n" +
                ":)");
        try{Thread.sleep(2000);}catch(InterruptedException e){System.out.println(e);}
        if (shouldSimulate() == false) {
            System.exit(0);
        } else {
            takeOutPrompt();
        }
    }

    public void takeOutPrompt() {
        shoppingBag = new ShoppingBag<>();
        int customerMoneyLeft = customer.getMoney();

        while (true) {

            Food selectedFood = getMenuSelection();
            if (selectedFood == null){
                getMenuSelection();
            }
            System.out.println("\n" +
                    "You've chosen: " + selectedFood);

            if (customerMoneyLeft >= selectedFood.getPrice()) {
                customerMoneyLeft -= selectedFood.getPrice();
                shoppingBag.addItem(selectedFood);
                customer.setMoney(customerMoneyLeft);
                System.out.println("Now you have €" + customerMoneyLeft + " currently available.");
                    if (isStillOrderingFood()) {
                     takeOutPrompt();
                    } else {
                        checkoutCustomer(shoppingBag);
                        break;
                    }
            } else {
                System.out.println("Oops! Looks like you don't have enough for that. Do you want to check for another food? (yes/no)");
                if (Objects.equals(input.next(), "no")) {
                    checkoutCustomer(shoppingBag);
                } else{
                    continue;
                }
            }
        }
    }
}