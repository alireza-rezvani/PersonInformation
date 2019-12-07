package ir.maktab32.java.projects.homework5.personinformation.model;

public class Address {
    private String city;
    private String zone;
    private String street;
    private String alley;
    private String postalCode;

    public Address(String city, String zone, String street, String alley, String postalCode) {
        this.city = city;
        this.zone = zone;
        this.street = street;
        this.alley = alley;
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAlley() {
        return alley;
    }

    public void setAlley(String alley) {
        this.alley = alley;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
