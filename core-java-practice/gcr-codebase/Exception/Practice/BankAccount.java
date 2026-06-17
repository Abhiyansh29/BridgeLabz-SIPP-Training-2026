class InsufficientFundsException extends Exception {
    private double amount;
    public InsufficientFundsException(String message, double amount) {
        super(message);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
 throw new InsufficientFundsException("Insufficient funds for withdrawal", amount - balance);
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.0);

        try {
            System.out.println("Depositing $50...");
            account.deposit(50.0);
            System.out.println("New balance: $" + account.getBalance());

            System.out.println("Withdrawing $200...");
            account.withdraw(200.0);
        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("Shortfall: $" + e.getAmount());
        }
    }
}


