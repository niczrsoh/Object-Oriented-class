// COMPILE & RUN THE CODE AT TRAVELLERTEST.JAVA
package SetD;

public class Traveller {
    
    private String name;
    private String destination;
    private String condition;
    private String status;
    static int total;
    Traveller(String name, String destination, String condition, String status){
        this.name = name;
        this.destination = destination;
        this.condition = condition;
        this.status = status;
        total++;
    }
    String getName() {return name;}
    String getDestination() {return destination;}
    String getCondition() {return condition;}
    String getStatus() {return status;}
    public String toString() {return String.format("%-18s %-18s %-18s %-18s",getName(),getDestination(),getCondition(),getStatus());}
}
