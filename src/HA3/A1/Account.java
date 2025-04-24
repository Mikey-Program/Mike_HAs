package src.HA3.A1;

//What is the difference between using protected vs. using private and providing a getter for subclasses to access an instance variable?
// -> private ist "sicherer"? Man kann nicht direkt auf die Attribute zugreifen und man hat dadruch Verkapselung mit den G/Settern

public class Account {
    public String owner;
    private double balance;
    protected int pin;
    String internalNote;

    public Account(String owner, double balance, int pin, String internalNote) {
        this.owner = owner;
        this.balance = balance;
        this.pin = pin;
        this.internalNote = internalNote;
    }

    public Account() {
    }

    public double getBalance(){
        return this.balance;
    }

    public void changePin(int currentPin, int newPin){
        if(currentPin == this.pin){
            this.pin= newPin;
        } else {
            System.out.println("Wrong Pin!");
        }
    }

    //habe direkt Setter und Getter erstellt - wusste nicht was genau mit "accessing all four attributes" gemeint ist.
    // -> das man z.B. objekt.attribut schreibt? Habe es einfach mit der VL und Settern gelöst

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getInternalNote() {
        return internalNote;
    }

    public void setInternalNote(String internalNote) {
        this.internalNote = internalNote;
    }
}
