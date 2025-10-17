package util;

public abstract class ATMwithoutDepositBox extends BankAccount {
    public ATMwithoutDepositBox(String accountNumber, double initialBalance, int pin) {
        // your code

        super(accountNumber, initialBalance);
    }

    @Override
    public void debit(double amount) {
        System.out.println("Through ATM machine");
        setBalance(getBalance() - amount);
    }
}