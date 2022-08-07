import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InputMismatchException {

       Scanner input = new Scanner(System.in);

       System.out.println("Hello. \n" +
               "Welcome to the Takeout simulator. \n" +
               "Please insert your First Name below:");
       String customerName = input.next();
        System.out.println("");
        System.out.println("Thank you! \n" +
               "Please insert your available amount of money below (EUR):");
       int money = input.nextInt();

       Customer customer = new Customer(customerName, money);
        
       TakeOutSimulator takeOutSimulator = new TakeOutSimulator(customer, input);
       takeOutSimulator.startTakeOutSimulator();


    }
}
