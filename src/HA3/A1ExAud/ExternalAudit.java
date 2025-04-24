package src.HA3.A1ExAud;

import src.HA3.A1.Account;

public class ExternalAudit {
    public static void main(String[] args) {

        Account test = new Account();
        //Accessing all four attributes:
        test.owner = "Mike"; //Public also direkter access; Rest muss mit Settern gemacht werden
        test.setBalance(10000);
        test.setPin(1234);
        test.setInternalNote("Note");
    }
}
