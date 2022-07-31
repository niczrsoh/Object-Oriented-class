package ProblemSolving;

public class Destination {
    private String city;
    private String country;
    public Destination(String city, String country) {
        this.city = city;
        this.country = country;
    }
    public String toString(){
        return city + ", " + country;
    }
}
