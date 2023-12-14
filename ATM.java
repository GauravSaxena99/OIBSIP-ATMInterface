public class ATM {
    private UserAccount savingsAccount;
    private String bankName;

    public ATM(UserAccount savingsAccount, String bankName) {
        this.savingsAccount = savingsAccount;
        this.bankName = bankName;
    }

    public double checkBalance() {
        return savingsAccount.getBalance();
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0) {
            savingsAccount.deposit(depositAmount);
            System.out.println("Deposit successful. Deposited: $" + depositAmount);
            System.out.println("New Balance: $" + savingsAccount.getBalance());
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive amount.");
        }
    }

    public void withdraw(double withdrawalAmount) {
        if (withdrawalAmount > 0) {
            double currentBalance = savingsAccount.getBalance();
            if (withdrawalAmount <= currentBalance) {
                savingsAccount.withdraw(withdrawalAmount);
                System.out.println("Withdrawal successful. Withdrawn: $" + withdrawalAmount);
                System.out.println("New Balance: $" + savingsAccount.getBalance());
            } else {
                System.out.println("Insufficient Balance for withdrawal.");
            }
        } else {
            System.out.println("Invalid withdrawal amount. Please enter a positive amount.");
        }
    }

    public void changePIN(String newPin) {
        savingsAccount.setPIN(newPin);
    }

    public String getBankName() {
        return bankName;
    }
}
