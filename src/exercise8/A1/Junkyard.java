package src.exercise8.A1;

import java.util.ArrayList;

public class Junkyard {

    private final ArrayList<? super Vehicle> DesVehicles;

    public Junkyard(ArrayList<? super Vehicle> desVehicles) {
        DesVehicles = desVehicles;
    }

    private <T extends Vehicle> void destroyVehicle(T V){
        DesVehicles.add(V);
    }
}
