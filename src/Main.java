//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);

        // OUTPUT "What is your existing credit card balance ?"
        System.out.print("What is your existing credit card balance ? ");

        // INPUT creditBalance
        double creditBalance = in.nextDouble();

        // interestRate = .17
        double interestRate = 0.17;

        // creditBalance = creditBalance + (creditBalance x interestRate) (Month 1)
        creditBalance = creditBalance + (creditBalance * interestRate);

        // OUTPUT "Your credit card balance after one month " + creditBalance
        System.out.println("Your credit card balance after one month " + creditBalance);

        // creditBalance = creditBalance + (creditBalance x interestRate) (Month 2)
        creditBalance = creditBalance + (creditBalance * interestRate);

        // OUTPUT "Your credit card balance after two months " + creditBalance
        System.out.println("Your credit card balance after two months " + creditBalance);

        // Close the scanner resource
        in.close();
    }
}