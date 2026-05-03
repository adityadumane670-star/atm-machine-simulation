import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int amount = 1000, a = 0, pin = 0, choice, language, choice1, withdraw, deposit;

        System.out.println("********Welcome to ATM Service***********");

        // Language Selection
        System.out.println("Select your Language");
        System.out.println("1. English");
        System.out.println("2. Marathi");
        System.out.println("3. Hindi");
        language = sc.nextInt();

        if (language < 1 || language > 3) {
            System.out.println("Invalid Choice");
            return;
        }

        // Card Insert
        System.out.println("Insert your card and press 1");
        a = sc.nextInt();

        if (a != 1) {
            System.out.println("Insert your card properly");
            return;
        }

        // PIN Verification
        while (pin != 1234) {
            System.out.print("Enter your PIN: ");
            pin = sc.nextInt();

            if (pin != 1234) {
                System.out.println("Please enter valid PIN");
            }
        }

        // Account Type
        System.out.println("Select your Account type");
        System.out.println("1. Saving");
        System.out.println("2. Current");
        choice = sc.nextInt();

        if (choice != 1 && choice != 2) {
            System.out.println("Invalid Choice");
            return;
        }

        // Menu (common for both accounts)
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Cash");
        System.out.println("3. Deposit Cash");
        System.out.println("4. Quit");
        System.out.print("Enter your choice: ");
        choice1 = sc.nextInt();

        switch (choice1) {

            case 1:
                System.out.println("Your account balance in RS: " + amount);
                break;

            case 2:
                System.out.print("Enter amount to withdraw: ");
                withdraw = sc.nextInt();

                if (withdraw % 100 != 0) {
                    System.out.println("Please enter the amount in multiple of 100");
                } else if (withdraw > (amount - 500)) {
                    System.out.println("Insufficient Balance");
                } else {
                    amount -= withdraw;
                    System.out.println("Please collect your cash");
                    System.out.println("Your Current Balance: " + amount);
                }
                break;

            case 3:
                System.out.print("Enter the amount to Deposit in RS: ");
                deposit = sc.nextInt();

                amount += deposit;
                System.out.println("Your current balance is: " + amount);
                break;

            case 4:
                System.out.println("Thank You For Using ATM");
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}