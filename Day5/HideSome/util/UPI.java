package util;
public class UPI extends BankAccount{
    public UPI(String accountNumber, double initialBalance, int pin) {
        // your code
        super(accountNumber, initialBalance);

    }

    @Override
    public void credit(double amount) {
        System.out.println("Through Gpay");
        setBalance(getBalance() + amount);

    }

    @Override
    public void debit(double amount) {
        System.out.println("Through Gpay");
        setBalance(getBalance() - amount);
    }
}