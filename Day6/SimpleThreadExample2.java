// Implementing Runnable interface
class NumberPrinter implements Runnable {
    private String threadName;

    public NumberPrinter(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " → " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
        System.out.println(threadName + " finished!");
    }
}

// Main class
public class SimpleThreadExample2 {
    public static void main(String[] args) {
       
        NumberPrinter task1 = new NumberPrinter("Thread X");
        NumberPrinter task2 = new NumberPrinter("Thread Y");

        
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        
        t1.start();
        t2.start();
    }
}
