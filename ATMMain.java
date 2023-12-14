import java.util.Scanner;

public class ATMMain {
    public static void main(String[] args) {
        UserAccount userAccount = new UserAccount("1234567890", "Gaurav Saxena", 10000.0, "1234");
        ATM atm = new ATM(userAccount, "My Bank");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to " + atm.getBankName() + "!");
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("(1). Check Balance");
            System.out.println("(2). Deposit");
            System.out.println("(3). Withdraw");
            System.out.println("(4). Change PIN");
            System.out.println("(5). Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // New_line Character

            switch (choice) {
                case 1:
                    System.out.println("Your Balance is: $" + atm.checkBalance());
                    break;
                case 2:
                    System.out.print("Enter the deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter the withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    atm.withdraw(withdrawalAmount);
                    break;
                case 4:
                    System.out.print("Enter a new 4-digit PIN: ");
                    String newPin = scanner.next();
                    atm.changePIN(newPin);
                    break;
                case 5:
                    System.out.println("Thanks for using the ATM. Have a good day! Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
