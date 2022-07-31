package Inheritance.revision2;

public class Address {
    private String street;
    private String city;
    private String state;
    public Address() {
    }
    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }
    public String getFullAddress() {
        return street + ", " + city + ", " + state;
    }
}
