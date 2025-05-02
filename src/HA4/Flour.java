package src.HA4;

public class Flour extends PopularGrocery{

    public Flour(int discountThreshold, int householdLimit, boolean isPopular, int popularityLevel, int quantity) {
        super(discountThreshold, householdLimit, isPopular, popularityLevel, quantity);
    }

    public Flour(int quantity, int discountThreshold, int popularityLevel){
        this.setQuantity(quantity);
        this.setDiscountThreshold(discountThreshold);
        this.setHouseholdLimit(15);
        //was ist mit popularityLevel?
    }

    @Override
    public int getBulkDiscount() {
        return 5; //noch ändern
    }
}
