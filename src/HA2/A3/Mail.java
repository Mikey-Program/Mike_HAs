package src.HA2.A3;

public class Mail {
    private String sender;
    private String senderAddress;
    private String subject;
    private String message;
    private String datetime;
    private boolean read;

    public Mail(String sender, String senderAddress, String subject, String message, String datetime) {
        this.sender=sender;
        this.senderAddress = senderAddress;
        this.subject = subject;
        this.message = message;
        this.datetime = datetime;
        this.read = false;
    }
    public void isRead(){
        this.read =true;
    }

    public String showMail(){
        return subject + " from " + sender + " on " +datetime+ ": " +message;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public boolean getRead(){
        return read;
    }
}
