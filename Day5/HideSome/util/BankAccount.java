package util;

public abstract class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance){
        this.balance = balance;
    }


    public abstract void credit(double amount);
    public abstract void debit(double amount);
}