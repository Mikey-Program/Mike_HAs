package src.HA5;

public class ShippingInfo {

    private String city;
    private int zip;
    private String country;

    public ShippingInfo(String city,int zip, String country) throws MissingShippingInfoException, InvalidShippingInfoException {
        if(city == null || city.isEmpty()) throw new MissingShippingInfoException("Stadt sollte nicht leer sein");
        this.city = city;

        if(zip<0) throw new InvalidShippingInfoException("Falscher Zip Code"); //wieso kann ich hier nicht einfach mit System.out.println
        // arbeiten? Was ist der Unterschied?
        this.zip = zip;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
