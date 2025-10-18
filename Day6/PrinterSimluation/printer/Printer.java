package printer;

// Shared printer class
public class Printer {
    private int jobCount = 0;

    // Synchronized method ensures only one thread prints at a time
    public synchronized void printDocument(String document, String user) {
        jobCount++;
        System.out.println(user + " started printing: " + document);
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            System.out.println(user + " printing interrupted.");
        }
        System.out.println(user + " finished printing: " + document 
                           + " | Total jobs printed: " + jobCount);
    }

    public int getJobCount() {
        return jobCount;
    }
}
