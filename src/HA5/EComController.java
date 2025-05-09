package src.HA5;

public class EComController {
    public static void main(String [] args) {

        ShippingInfo info = new ShippingInfo (" Munich", 80331 , "Germany ");

        Profile profile = new Profile(info);
        Customer customer = new Customer(profile, 123);

        System.out.println (" Shipping to: " + customer.getProfile().getShippingInfo().getCity ());
    }

    //Fragen auf Blatt: (War nicht anwesend in VL wegen Termin - GPT u. Internet geholfen)
    //Is your code an example of dependency injection? Explain why or why not.
    // Ja es ist ein Bsp. für DI, da wir bei den Klassen Profile und Customer die Infos "von außen" bekommen und
    // die Infos erst in den Konstruktoren erstellt/erhalten werden (injiziert)

    //You realize that your code breaks the law of Demeter, explain why and what a possible fix looks like
    // LaD wird verletzt, da wir als Customer nicht auf direkte "Nachbarn" zugreifen können/müssen - siehe Print-Statement
    // Man kann es umgehen indem man neue Methoden einführt, die gewisse Aufgaben übernehmen, z.B. eine Methode, die
    // direkt die Stadt eines Customers gibt - indem die anderen Methoden in den Klassen immer weiter abfragen -
    // also es werden trotzdem mehrere Methoden ausgeführt, aber diesemal stehen die Methoden "ineinander" anstatt alle
    // "nacheinander" aufzurufen wie im Print-Statement
}
