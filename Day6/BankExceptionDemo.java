import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message); 
    }
}


class BankAccount {
    private double balance;

    
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    
    public void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

   
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid amount! Please enter a positive value.");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Withdrawal failed! Insufficient balance.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful! You withdrew ₹" + amount);
        displayBalance();
    }
}


public class BankExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(5000.00); 

        System.out.println("Welcome to ABC Bank");
        account.displayBalance();

        try {
            System.out.print("\nEnter amount to withdraw: ₹");
            double amount = scanner.nextDouble();

            
            account.withdraw(amount);
        } 
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } 
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        } 
        finally {
            System.out.println("\nTransaction complete. Thank you for banking with us!");
            scanner.close();
        }
    }
}
