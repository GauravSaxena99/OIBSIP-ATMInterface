public class UserAccount {
    private String accNumber;
    private String accHolderName;
    private double balance;
    private String PIN;

    public UserAccount(String accNumber, String accHolderName, double initialBalance, String PIN) {
        this.accNumber = accNumber;
        this.accHolderName = accHolderName;
        this.balance = initialBalance;
        this.PIN = PIN;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0) {
            balance += depositAmount;
        }
    }

    public void withdraw(double withdrawalAmount) {
        if (withdrawalAmount > 0 && withdrawalAmount <= balance) {
            balance -= withdrawalAmount;
        }
    }

    public void setPIN(String newPin) {
        if (newPin.length() == 4) {
            PIN = newPin;
            System.out.println("PIN changed successfully.");
        } else {
            System.out.println("Invalid PIN. Please enter a 4-digit PIN.");
        }
    }

    public String getAccNumber() {
        return accNumber;
    }

    public String getAccHolderName() {
        return accHolderName;
    }
}
