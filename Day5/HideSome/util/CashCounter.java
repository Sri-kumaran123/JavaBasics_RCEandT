package util;
public class CashCounter extends ATMwithoutDepositBox{
    public CashCounter(String accountNumber, double initialBalance, String sign) {
        // your code
        super(accountNumber, initialBalance, 123);
    }

    @Override
    public void credit(double amount) {
        System.out.println("Through Bank");
        setBalance(getBalance() + amount);
    }
}