package src.HA4;

public class GroceryItem extends Article{

    private boolean isPopular;

    public GroceryItem(int discountThreshold, int householdLimit, boolean isPopular) {
        super(discountThreshold, householdLimit);
        this.isPopular = isPopular;
    }

    public GroceryItem() {

    }

    @Override
    public int getBulkDiscount() {
        return 0; //noch ändern
    }

    @Override
    public boolean showWarning() {
        return false; //noch ändern
    }

    public boolean isPopular() {
        return isPopular;
    }

    public void setPopular(boolean popular) {
        isPopular = popular;
    }
}
