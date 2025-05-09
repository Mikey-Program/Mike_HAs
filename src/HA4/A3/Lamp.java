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
        if(level <=0 || level > Dimmable.MAX_BRIGHTNESS){
            System.out.println("Falsche Angabe der Helligkeit!");
        } else {
            this.brightness = level;
        }
    }

    @Override
    public int getBrightness() {
        return this.brightness;
    }

    @Override
    public void dimToHalf() {
        if(this.isOn()){
            this.brightness = Dimmable.MAX_BRIGHTNESS/2;
        } else {
            System.out.println("Erst Lampe anmachen");
        }
    }
}
