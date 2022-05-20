package ENUM;
import java.util.*;
    
public enum Vehicle {
    MOTORCYCLE(1), SEDAN_CAR(2),
    MPV_CAR(3), VAN(3);

    private double priceperhour;

    private Vehicle(double price) {
        priceperhour = price;
    }

    public double getPricePerHour() {
        return priceperhour;
    }

    public double getTotalPrice(int hour) {
        return hour * priceperhour;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (Vehicle v : Vehicle.values())
        //using ordinal to get the constant's ordinal value
            System.out.println(v.ordinal() + 1 + "." + v);
        System.out.print("Enter the choice: ");
        int choice = scanner.nextInt();
        //.values is to return all values in the enum.
        Vehicle choosen = Vehicle.values()[choice - 1];
        for (Vehicle v : Vehicle.values())
            System.out.printf("%-18s RM%.2f per hour \n",v,v.getPricePerHour()); 
        
        System.out.print("Enter parking hours: ");
        int hour = scanner.nextInt();
        System.out.printf("Total price: RM%.2f \n", choosen.getTotalPrice(hour));
    }
}