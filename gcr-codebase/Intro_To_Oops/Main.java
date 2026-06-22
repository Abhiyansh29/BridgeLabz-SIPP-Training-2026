import java.util.ArrayList;

class BankAccount {

    private int accountNumber;
    private String holder;
    private double balance;

    private ArrayList<String> transactions = new ArrayList<>();

    static int totalAccountsCreated = 0;

    // Constructor
    public BankAccount(int accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccountsCreated++;
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add("Deposited ₹" + amount + " | Balance: ₹" + balance);
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            transactions.add("Withdrawal of ₹" + amount + " failed (Insufficient Balance)");
            System.out.println("Withdrawal failed! Insufficient balance.");
        } else {
            balance -= amount;
            transactions.add("Withdrawn ₹" + amount + " | Balance: ₹" + balance);
            System.out.println("₹" + amount + " withdrawn successfully.");
        }
    }

    // Display Statement
    public void getStatement() {
        System.out.println("\n-----------------------------------");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holder);
        System.out.println("Current Balance: ₹" + balance);

        System.out.println("\nTransaction History:");
        for (String t : transactions) {
            System.out.println(t);
        }
        System.out.println("-----------------------------------");
    }
}

public class Main {

    public static void main(String[] args) {

       
        BankAccount acc1 = new BankAccount(1001, "Rahul", 10000);
        BankAccount acc2 = new BankAccount(1002, "Priya", 8000);
        BankAccount acc3 = new BankAccount(1003, "Aman", 12000);

        
        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc1.deposit(3000);
        acc1.withdraw(5000);
        acc1.withdraw(12000); 

        acc2.deposit(1000);
        acc2.withdraw(500);
        acc2.withdraw(9000); 
        acc2.deposit(4000);
        acc2.withdraw(2000);

        
        acc3.withdraw(1000);
        acc3.deposit(5000);
        acc3.withdraw(3000);
        acc3.deposit(2500);
        acc3.withdraw(15000); 

        
        acc1.getStatement();
        acc2.getStatement();
        acc3.getStatement();

        
        System.out.println("\nTotal Accounts Created: " + BankAccount.totalAccountsCreated);
    }
}