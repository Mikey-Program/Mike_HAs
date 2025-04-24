package src.HA3.A2;

public class Main {
    public static void main(String[] args) {
        Message m1 = new Email ();
        Message m2 = new SMS ();
        System.out.println(m1.getType ());
        System.out.println(m2.getType ());
        //m1.send (); // Uncomment this line and explain what happens -> cannot resolve method 'send' in 'Message'
        // static type: Message-> bestimmt welche Methoden benutzt werden können, hier: nur Message methoden für type
        //dynamc type: Email -> bestimmt wie die Methoden umgesetzt werden, hier: es wird getType() von der Email Klasse verwendet
        //man könnte casten wie von IntelliJ vorgeschlagen: ((Email) m1).send() - geht es auch anders?
    }
}
