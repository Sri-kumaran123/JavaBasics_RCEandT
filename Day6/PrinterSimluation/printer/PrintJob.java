package printer;

public class PrintJob {
    private String documentName;

    public PrintJob(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentName() {
        return documentName;
    }
}
