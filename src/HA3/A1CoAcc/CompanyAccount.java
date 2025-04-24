package src.HA3.A1CoAcc;

import src.HA3.A1.Account;

public class CompanyAccount extends Account {

    public CompanyAccount(String owner, double balance, int pin, String internalNote) {
        super(owner, balance, pin, internalNote);
    }

    public static void main(String[] args) {
        Account test = new Account();
        //Accessing all four Attributes:
        test.owner = "Mike";
        test.setBalance(100000);
        test.setPin(1234); //Wieso muss hier ein Setter verwendet werden?
        //test.pin = 1234; // -> Wieso gibt das einen Fehler? Laut VL soll das klappen, oder? Siehe VL 02 Folie 17
        test.setInternalNote("Note");
    }
}
