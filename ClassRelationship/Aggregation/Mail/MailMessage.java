package Aggregation.Mail;

public class MailMessage{
    Header header;
    Body body;
    Attachment att;
    MailMessage(Header header, Body body, Attachment att){
        this.header = header;
        this.body = body;
        this.att = att;
    }
    public void print(){
        System.out.println("Header: " + header.getTitle());
        System.out.println("Body: " + body.getMessage());
        System.out.println("Attachment: "+ att.getFilename());
    }
}