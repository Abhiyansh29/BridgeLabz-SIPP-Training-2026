import java.util.Scanner;

class InsufficientBalanceException extends Exception {

    private double balance;
    private double withdrawalAmount;

    public InsufficientBalanceException(double balance,double withdrawalAmount) {
        super("Insufficient Balance!");
        this.balance = balance;
        this.withdrawalAmount = withdrawalAmount;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawalAmount() {
        return withdrawalAmount;
    }
}

class BankAccount {
    private double balance = 5000;

    public void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }

        balance -= amount;
        System.out.println("Withdrawal Successful!");
        System.out.println("Remaining Balance: ₹" + balance);
    }
}

public class ATMWithdrawl {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        Scanner sc=new Scanner(System.in);

        try {
            System.out.println("Enter Amount you want to withdrawl");
            double amt=sc.nextDouble();
            account.withdraw(amt);
        }
        catch (InsufficientBalanceException e) {
            System.out.println("Transaction Failed!");
            System.out.println("Available Balance: ₹"
                               + e.getBalance());
            System.out.println("Requested Amount: ₹"
                               + e.getWithdrawalAmount());
            System.out.println("Shortfall: ₹"
                               + (e.getWithdrawalAmount()
                                  - e.getBalance()));
        }
    }
}