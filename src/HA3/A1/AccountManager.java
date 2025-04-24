package src.HA3.A1;

public class AccountManager {
    public static void main(String[] args) {

        Account test = new Account();
        //Accessing all four attributes:
        test.owner = "Mike";
        test.setBalance(100000); //setter needed; because private
        test.pin = 1234;
        test.internalNote = "Note";

    }
}
