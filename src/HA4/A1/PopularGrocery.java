package src.HA4.A1;

public class PopularGrocery extends GroceryItem{

    private int popularityLevel, quantity;

    public PopularGrocery(int discountThreshold, int householdLimit, boolean isPopular, int popularityLevel, int quantity) {
        super(discountThreshold, householdLimit, isPopular);
        this.popularityLevel = popularityLevel;
        this.quantity = quantity;
    }

    public PopularGrocery( int popularityLevel) {
        super.setPopular(true);
        this.popularityLevel = popularityLevel;
    }

    public PopularGrocery() {

    }

    @Override
    public boolean showWarning(){
        return this.quantity > this.getHouseholdLimit();
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() { //Darf ich den laut Aufgabenstellung erstellen?
        return quantity;
    }
}
