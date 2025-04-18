package src.HA2.A3;

public class Main {
    public static void main(String[] args){

        Inbox inbox = new Inbox(4);
        Mail mail1 = new Mail("BCG", "Musterstr", "Bewerbung" , "Sie wurden angenommen!", "25.04.25");
        Mail mail2 = new Mail("McDonald's","Musterfeld", "Bewerbung" , "Unfortunately...", "24.04.25");
        Mail mail3 = new Mail("Mama","Am Musternen Feld", "Geschenk" , "Ich habe dir ein Geschenk geschickt zu Ostern!", "21.04.25");
        Mail mail4 = new Mail("Stadt Musterstadt","Musterstadt", "Strafzettel" , "falsch geparkt!", "17.04.25");

        inbox.addMail(mail1);
        inbox.addMail(mail2);
        inbox.addMail(mail3);
        inbox.addMail(mail4);

        inbox.getMail(1).isRead();
        inbox.getMail(3).isRead();

        System.out.println();
        System.out.println(inbox.countUnread());
        System.out.println();
        System.out.println(inbox.getMail(0).showMail());
        System.out.println(inbox.getMail(2).showMail());

    }
}
