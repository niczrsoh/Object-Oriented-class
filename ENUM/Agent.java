package ENUM;
/*
Name: Soh Zen Ren
Matric No: A20EC0152
*/
import java.util.Scanner;
//MAKING ENUM FILE BY NAMING IT AS AGENT
public enum Agent{
    Nilam(2020.00,0.14), Aqiq(1440.00,0.08), Delima(1490.00,0.10) ,Zamrud(2075.00,0.15);
    double cost;
    double commission;

    Agent(double cost, double commission){
        this.cost = cost;
        this.commission = commission;
    }
    public double getCost() {
        return cost;
    }
    public double getCommission() {
        return commission*100;
    }
    public String getDetail(Agent agent) {
        switch(agent){
            case Nilam: 
                 return "person for 5D4N Adelaide";
            case Aqiq:
                return "person for 5D4N Gold Coast";
            case Delima:
                return "person for 5D4N Melbourne";
            default:
                return "person for 5D4N Perth";
        }
    }
    int readInput(){
        int numPerson;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of person(s): ");
        numPerson = scanner.nextInt();
        return numPerson;
    }
    double calcCommission(double tCost){
        return commission*tCost;
    }
}