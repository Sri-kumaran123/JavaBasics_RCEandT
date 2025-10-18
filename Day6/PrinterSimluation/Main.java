

import printer.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Printer sharedPrinter = new Printer();

        // Jobs for User-1
        List<PrintJob> user1Jobs = Arrays.asList(
            new PrintJob("Document1.pdf"),
            new PrintJob("Document2.pdf")
        );

        // Jobs for User-2
        List<PrintJob> user2Jobs = Arrays.asList(
            new PrintJob("Document3.pdf"),
            new PrintJob("Document4.pdf")
        );

        // Create threads for each user
        Thread user1 = new Thread(new PrintTask(sharedPrinter, "User-1", user1Jobs));
        Thread user2 = new Thread(new PrintTask(sharedPrinter, "User-2", user2Jobs));

        // Start printing
        user1.start();
        user2.start();
    }
}
