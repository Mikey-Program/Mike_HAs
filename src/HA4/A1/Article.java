package src.HA4.A1;

public abstract class Article {

    private int discountThreshold, householdLimit;

    public Article(int discountThreshold, int householdLimit) {
        this.discountThreshold = discountThreshold;
        this.householdLimit = householdLimit;
    }

    public Article() {
    }

    public abstract int getBulkDiscount();

    public abstract boolean showWarning();

    public int getDiscountThreshold() {
        return discountThreshold;
    }

    public void setDiscountThreshold(int discountThreshold) {
        this.discountThreshold = discountThreshold;
    }

    public int getHouseholdLimit() {
        return householdLimit;
    }

    public void setHouseholdLimit(int householdLimit) {
        this.householdLimit = householdLimit;
    }
}
