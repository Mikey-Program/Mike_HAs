package src.HA5;

public class Profile {

    private ShippingInfo shippingInfo;

    public Profile(ShippingInfo info) throws InvalidShippingInfoException {
        if (info == null) throw new InvalidShippingInfoException("Fehlende Versanddaten");
        else this.shippingInfo = info;
    }

    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    public void setInfo(ShippingInfo info) {
        this.shippingInfo = info;
    }
}
