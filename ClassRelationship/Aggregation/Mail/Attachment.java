package Aggregation.Mail;

public class Attachment {
    private String filename;
    Attachment(String filename) {
        this.filename = filename;
    }
    String getFilename() { return filename; }
}
