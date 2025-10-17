import util.*;

public class Main {
    public static void main(String[] args){
        BankAccount holder1 = new UPI("IOB123",1000,123456);
        BankAccount holder2 = new CashCounter("TNM345",3000,"name");
        BankAccount holder3 = new ATMwithoutDepositBox("RBI678",2000,1234) {
            @Override
            public void credit(double amount) {
                System.out.println("Inside class");
                setBalance(getBalance() + amount);
            }
        };

        holder2.credit(200);
        holder2.debit(300);

        holder3.debit(100);
        holder3.credit(100);

        holder1.credit(2000);

        System.out.println("amount : "+holder1.getBalance());
        System.out.println("amount : " + holder2.getBalance());
        System.out.println("amount : "+holder3.getBalance());



    }
}