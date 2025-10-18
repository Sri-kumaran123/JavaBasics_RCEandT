public class SimpleThreadExample3 {
    public static void main(String[] args) {

        // Thread X using lambda
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread X → " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Thread X interrupted.");
                }
            }
            System.out.println("Thread X finished!");
        });

        // Thread Y using lambda
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread Y → " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Thread Y interrupted.");
                }
            }
            System.out.println("Thread Y finished!");
        });

       
        t1.start();
        t2.start();
    }
}
