package src.exercise4.A2;

public class EVan extends Vehicle implements Electrified {

    // TODO: add attributes , constants and implement required methods
    private double batteryLevel;

    public EVan(String id, double maxLoad, double batteryCapacity) {
        super(id, maxLoad);
        this.batteryLevel = batteryCapacity;
        // TODO: initialise attributes
    }

    // TODO: implement Vehicle + Electrified methods
    @Override
    public void charge(double kWh) {
        this.batteryLevel = this.batteryLevel + kWh;
    }

    @Override
    public double getBatteryLevel() {
        return this.batteryLevel;
    }

    @Override
    public double getRange() {
        return this.batteryLevel/0.25;
    }

    @Override
    public double fuelNeeded(double distance) {
        return distance * 0.25;
    }



}

