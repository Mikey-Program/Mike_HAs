package src.HA4;

public class Milk extends PopularGrocery{

    public Milk(int discountThreshold, int householdLimit, boolean isPopular, int popularityLevel, int quantity) {
        super(discountThreshold, householdLimit, isPopular, popularityLevel, quantity);
    }

    public Milk(int quantity, int discountThreshold, int popularityLevel){
        super();
        this.setDiscountThreshold(discountThreshold);
        this.setQuantity(quantity);
        this.setHouseholdLimit(20);
        // was ist mit popularityLevel laut Aufgabe?
    }

    @Override
    public int getBulkDiscount() {
        return 12; // noch ändern
    }
}
