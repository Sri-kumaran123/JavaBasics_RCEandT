package printer;

import java.util.List;

public class PrintTask implements Runnable {
    private Printer printer;
    private String userName;
    private List<PrintJob> jobs;

    public PrintTask(Printer printer, String userName, List<PrintJob> jobs) {
        this.printer = printer;
        this.userName = userName;
        this.jobs = jobs;
    }

    @Override
    public void run() {
        for (PrintJob job : jobs) {
            printer.printDocument(job.getDocumentName(), userName);
        }
    }
}
