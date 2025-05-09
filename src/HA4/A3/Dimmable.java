package src.HA4.A3;

public interface Dimmable {

    int MAX_BRIGHTNESS = 100;

    void setBrightness(int level);

    int getBrightness();

    void dimToHalf();
}
