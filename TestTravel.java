//Soh Zen Ren A20EC0152
//learn about using constructor, setter & getter in java
class Travel{
    private String destination;
    private String travellerName;
    private String travellerAddr;
    private double price;
    static int count;
    Travel(){
        destination = "-";
        travellerName ="-";
        travellerAddr = "-";
        price = 0.0;
        count++;
    }
    Travel(String destination, String travellerName){
        this.destination = destination;
        this.travellerName = travellerName;
        count++;
    }
    void setDestination(String destination)
    {
        this.destination = destination;
    }
    void setTravellerName(String travellerName){
        this.travellerName = travellerName;
    }
    void setTravellerAddress(String travellerAddr){
        this.travellerAddr = travellerAddr;
    }
    void setPrice(double price){
        this.price = price;
    }
   String getTravellerName(){
        return travellerName;
    }
    String getTravellerAddr(){
        return travellerAddr;
    }
    double getPrice(){
        return price;
    }
     void display(){
        System.out.println("Destination: "+ destination);
        System.out.println("Traveller Name: "+ travellerName);
        System.out.println("Traveller Adddress: "+ travellerAddr);
        System.out.printf("Price: RM %.2f \n\n",price);
    }
};
public class TestTravel{
    public static void main(String[] args){
        Travel t1= new Travel();
        Travel t2 = new Travel("KLCC","Chan");
        Travel t3 =new Travel();
        t1.setDestination("UTM");
        t1.setTravellerName("Ali");
        t1.setTravellerAddress("Sultan Ibrahim Chancellery Building, Jalan Iman, 81310 Skudai, Johor");
        t1.setPrice(50.50);
        t1.display();
        t2.display();
        t3.display();
        System.out.println("Number of traveller:"+Travel.count);
    }
}