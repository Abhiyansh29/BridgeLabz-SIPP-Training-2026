// Abstract Class
abstract class BankAccount {

    // Private fields
    private String accountNumber;
    private String holderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Setters
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Display Method
    public void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holderName);
        System.out.println("Balance        : ₹" + balance);
    }

    // Abstract Method
    public abstract double calculateInterest();
}

// Savings Account Class
class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(String accountNumber, String holderName,
                          double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}

// Current Account Class
class CurrentAccount extends BankAccount {

    private double monthlyBonusRate;

    public CurrentAccount(String accountNumber, String holderName,
                          double balance, double monthlyBonusRate) {
        super(accountNumber, holderName, balance);
        this.monthlyBonusRate = monthlyBonusRate;
    }

    public double getMonthlyBonusRate() {
        return monthlyBonusRate;
    }

    public void setMonthlyBonusRate(double monthlyBonusRate) {
        this.monthlyBonusRate = monthlyBonusRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * monthlyBonusRate / 100;
    }
}

// Main Class
public class BankingSystem {

    public static void main(String[] args) {

        SavingsAccount savings =
                new SavingsAccount("SB101", "Rahul", 50000, 5);

        CurrentAccount current =
                new CurrentAccount("CA201", "Priya", 30000, 2);

        // Savings Account Operations
        System.out.println("----- Savings Account -----");
        savings.deposit(10000);
        savings.withdraw(5000);
        savings.displayAccountDetails();
        System.out.println("Interest : ₹" + savings.calculateInterest());

        System.out.println();

        // Current Account Operations
        System.out.println("----- Current Account -----");
        current.deposit(5000);
        current.withdraw(2000);
        current.displayAccountDetails();
        System.out.println("Interest : ₹" + current.calculateInterest());
    }
}