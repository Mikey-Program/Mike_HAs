package src.exercise4.A2;

public class FleetDemo {
    public static void main(String[] args) {

        // TODO: create a Truck and an EVan, test methods as described
        //Show canReach(300) on each, the "refuel/charge" and check again
        Truck truck = new Truck("Truck1", 1000, 100);
        EVan eVan = new EVan("EVan1", 1000, 100);
        System.out.println("Truck can reach 300 km: " + truck.canReach(300));
        //System.out.println("EVan can reach 300 km: " + eVan.canReach(300));
        truck.refuel(100);
        eVan.charge(100);
        //Print the fuel or battery level before and after
        System.out.println("Truck fuel level: " + truck.getFuelLevel());
        System.out.println("EVan battery level: " + eVan.getBatteryLevel());
    }}
