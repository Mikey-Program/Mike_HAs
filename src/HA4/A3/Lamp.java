package src.HA4.A3;

public class Lamp implements Switchable, Dimmable{

    private boolean on;
    private int brightness;

    @Override
    public void turnOn() {
        if(!this.on) {
            this.on = true;
        } else{
        System.out.println("Ist schon an");}
    }

    @Override
    public void turnOff() {
        if(this.on) this.on = false;
        else System.out.println("Ist schon aus");
    }

    @Override
    public boolean isOn() {
        return this.on; //das ist eine Abfrage, oder? Also es wird nichts verändert?
    }

    @Override
    public void setBrightness(int level) {
        if(level <=0 || level > Dimmable.MAX_BRIGHTNESS || !this.on ){
            System.out.println("Falsche Angabe der Helligkeit oder Lampe aus!");
        } else {
            this.brightness = level;
        }
    }

    @Override
    public int getBrightness() {
        return this.brightness;
    }

    //dimToHalf muss nicht implementiert werden, da es default im Interface schon ist - es hat schon eine Implementierung
    // -> die Bedingungen werden in setBrightness kontrolliert
}
