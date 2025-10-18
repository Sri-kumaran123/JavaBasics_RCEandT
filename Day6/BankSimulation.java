
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Synchronized deposit method
    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() 
            + " deposited ₹" + amount + " | New Balance: ₹" + balance);
        try { Thread.sleep(100); } catch (InterruptedException e) {}
    }

    // Synchronized withdraw method
    public synchronized void withdraw(double amount) {
        if (amount > balance) {
            System.out.println(Thread.currentThread().getName() 
                + " attempted to withdraw ₹" + amount 
                + " but insufficient balance! Current Balance: ₹" + balance);
        } else {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() 
                + " withdrew ₹" + amount + " | Remaining Balance: ₹" + balance);
        }
        try { Thread.sleep(100); } catch (InterruptedException e) {}
    }

    public double getBalance() {
        return balance;
    }
}

class UserTask implements Runnable {
    private BankAccount account;

    public UserTask(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        // Each thread performs deposits and withdrawals
        account.deposit(1000);
        account.withdraw(500);
        account.withdraw(2000);
        account.deposit(700);
    }
}


public class BankSimulation {
    public static void main(String[] args) {
        BankAccount sharedAccount = new BankAccount(5000);

        // Create multiple threads representing different users
        Thread user1 = new Thread(new UserTask(sharedAccount), "User-1");
        Thread user2 = new Thread(new UserTask(sharedAccount), "User-2");
        Thread user3 = new Thread(new UserTask(sharedAccount), "User-3");

        // Start the threads
        user1.start();
        user2.start();
        user3.start();
    }
}
