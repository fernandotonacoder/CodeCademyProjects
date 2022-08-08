import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static int money;

    public static void main(String[] args) throws InputMismatchException {

        Scanner input = new Scanner(System.in);

        System.out.println("Hello. \n" +
                "Welcome to the Takeout simulator. \n" +
                "Please insert your First Name below:");
        String customerName = input.next();
        System.out.println("");
        System.out.println("Thank you!");

        int customerMoney = askMoney();
        Customer customer = new Customer(customerName, customerMoney);
        TakeOutSimulator takeOutSimulator = new TakeOutSimulator(customer, input);
        takeOutSimulator.startTakeOutSimulator();
    }

    private static int askMoney() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert your (Integer) available amount of money below (EUR):");
        if (input.hasNextInt()) {
            money = input.nextInt();
        } else {
            System.out.println("Invalid Integer amount");
            askMoney();
        }
        return money;
    }
}