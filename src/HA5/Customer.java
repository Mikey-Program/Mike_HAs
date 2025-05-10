package src.HA5;

public class Customer {

    private Profile profile;
    private int id;

    public Customer(Profile profile, int id) throws InvalidCustomerException {
        if(profile == null) throw new InvalidCustomerException("Fehlendes Profil");
        else this.profile = profile;

        if(id <0) throw new InvalidCustomerException("falsche ID");
        else this.id = id;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
