package Aggregation.Mail;

public class MailMessageTest {
    public static void main(String[] args){
    Header header = new Header("Object-Oriented Programming");
    Body body = new Body("Lab Exercises for Aggregation");
    Attachment attachment = new Attachment("Lab8.java");
    MailMessage mailMessage = new MailMessage(header, body, attachment);
    mailMessage.print();}
}
