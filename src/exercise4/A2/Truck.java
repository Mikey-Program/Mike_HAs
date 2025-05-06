package src.exercise4.A2;

public class Truck extends Vehicle implements Refuelable {

    private double fuellevel;

    // TODO: add attributes , constants and implement required methods
    public Truck(String id, double maxLoad, double tankCapacity) {
        super(id, maxLoad);
        this.fuellevel = tankCapacity;

    // TODO: initialise attributes
    }

    // TODO: implement Vehicle + Refuelable methods
    @Override
    public void refuel(double liters) {
        this.fuellevel = this.fuellevel + liters;
    }

    @Override
    public double getFuelLevel() {
        return this.fuellevel;
    }

    @Override
    public double getRange() {
        return this.fuellevel/0.3;
    }

    @Override
    public double fuelNeeded(double distance) {
        return distance * 0.3;
    }


}
