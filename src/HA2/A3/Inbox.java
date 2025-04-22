package src.HA2.A3;

public class Inbox {

    private Mail[] mails;


    public Inbox(int size) {
        mails = new Mail[size];
    }

    public void getHeaders(){
        for (Mail mail : mails) {
            System.out.println(mail.getRead() + "|" + mail.getSubject() + "|" + mail.getSender() + "|" + mail.getDatetime());
        }
    }

    public void open(int index){
        if(index >= mails.length){
            System.out.println("Index is too large!");
        }
        System.out.println(mails[index].getRead() + "|" + mails[index].getSubject() + "|" + mails[index].getSender() + "|" +mails[index].getDatetime());
        System.out.println(mails[index].getMessage());
        mails[index].isRead();
    }

    public int countUnread(){
        int count =0;
        for (Mail mail : mails) {
            if (!mail.getRead()) {
                count++;
            }
        }
        return count;
    }

    public Mail[] getMails() {
        return mails;
    }

    public void setMails(Mail[] mails) {
        this.mails = mails;
    }

    public void addMail(Mail m){
        for (int i = 0; i< mails.length; i++){
            if(mails[i] ==null){
                mails[i] = m;
                break;
            }
        }
    }

    public Mail getMail(int index){
        if (index >= 0 && index < mails.length) {
            return mails[index];
        }
        return null;
    }
}
