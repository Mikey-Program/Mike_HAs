package src.HA5;

public class Profile {

    private ShippingInfo shippingInfo;

    public Profile(ShippingInfo info) {
        this.shippingInfo = info;
    }

    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    public void setInfo(ShippingInfo info) {
        this.shippingInfo = info;
    }
}
