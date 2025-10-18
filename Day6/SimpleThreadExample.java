
class NumberPrinter extends Thread {
    private String threadName;

    public NumberPrinter(String name) {
        this.threadName = name;
    }

    
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


public class SimpleThreadExample {
    public static void main(String[] args) {
        NumberPrinter t1 = new NumberPrinter("Thread A");
        NumberPrinter t2 = new NumberPrinter("Thread B");

        
        t1.start();
        t2.start();
    }
}
