package src.HA5;

public class EComController {
    public static void main(String [] args) throws MissingShippingInfoException, InvalidShippingInfoException, InvalidCustomerException {

        ShippingInfo shippingInfo = null;
        try {
            shippingInfo = new ShippingInfo(" Munich", -80331, "Germany ");
            Profile profile = new Profile(shippingInfo);
            Customer customer = new Customer(profile, 123);

            System.out.println("Shipping to: " + customer.getProfile().getShippingInfo().getCity());

        } catch (InvalidShippingInfoException i) {
            System.out.println("Falsche Info: " + i.getMessage());
        } catch (MissingShippingInfoException m){
            System.out.println("Fehlende Infos " + m.getMessage());
        } catch (InvalidCustomerException i){
            System.out.println("Falsche Kundendaten: " + i.getMessage());
        } catch (Exception e){ //GPT TIPP
            System.out.println("Anderer Fehler: " + e.getMessage());
        }

    }

    //Aufg. 1:
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

    //Aufg. 2: additional Questions (Alles GPT erarbeitet - gibt es Musterlösungen? (Skript noch nicht verfügbar mit Exception zu dem Zeitpunkt - Konnte nicht anwesend sein in VL)
    // Da es GPT ist: Antworten nicht reinkopieren/unnötig, oder?

    //    1) What generally happens if an exception is thrown but not caught?
    //    Wenn eine Exception nicht gefangen wird, wird sie an den Aufrufer weitergereicht (Propagation).
    //    Findet sich auch dort kein try-catch, wird die Exception bis zur main-Methode weitergegeben.
    //    Wird sie auch dort nicht behandelt, führt das zu einem Programmabbruch und es wird ein Stack Trace ausgegeben.
    //    Merksatz:
    //    Unbehandelte Exceptions = Programmabbruch + Stack Trace
}
