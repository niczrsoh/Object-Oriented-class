package Inheritance.revision2;

public class Person {
    private String name;
    private String phone;
    protected Address address;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Person() {
    }
    public Person(String name, String phone, Address address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }
}
