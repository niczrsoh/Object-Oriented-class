/*COMPILE & RUN THE CODE HERE
THIS LAB INCLUDES ENUM , FILE, CLASS , ARRAY LIST ,ENHANCED FOR LOOP, FORMATTING & STATIC IN JAVA
SOH ZEN REN A20EC0152
THERESA LAU XIN YI A20EC0167*/
package SetD;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TravelTest {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("InputSD.txt"));
        //Create an arraylist object by taking Object as the type.
        ArrayList <Object>obj = new ArrayList<Object>();
        int deny=0;
        int standby=0;
        int permit=0;
        //read the file 
        while(scanner.hasNextLine()){
            String name = scanner.next(); 
            String destination = scanner.next();
            String cases = scanner.next();
            Health health;
            switch(cases.toUpperCase()){
                case "CASE1": deny++; break;
                case "CASE2": deny++; break;
                case "CASE3": standby++; break;
                default: permit++;
            }
            health = Health.valueOf(Health.class, cases.toUpperCase());
            //create a Country object by getting the traveller name, destination, health's condition and boarding info 
            Traveller travel = new Traveller(name, destination,health.getCondition(),health.getBoard());
            //add the object into the obj array list
            obj.add(travel);
        }
        scanner.close();
        System.out.println("Travel Guideline");
        //using enhanced for loop to display the condition and board information based on respective cases
        for(Health h: Health.values()){
            System.out.printf("CASE%d:%-15s %-20s\n",h.ordinal()+1,h.getCondition(),h.getBoard());
        }
        System.out.println("\n\n\nLIST OF TRAVELLER BOARDING STATUS");
        System.out.printf("%-8s %-18s %-18s %-18s %-18s \n","Case","NAME","DESTINATION","HEALTH CONDITION","Status");
        int count=1;
        //display info of each object using enhanced for-loop & toString() method 
        for(Object o:obj){
            System.out.printf("%-8s %-80s\n",count,o.toString());
            count++;
        }
        System.out.println("\nTotal Deny Boarding = "+deny);
        System.out.println("Total Standby Boarding = "+standby);
        System.out.println("Total Permit Boarding = "+permit);
        //get the total number of traveller from the static variable, "total" of Travller class.
        System.out.println("Total Number of Traveller = "+Traveller.total);
        System. out. print("\nPress any key to continue ...");
        try{System. in. read();}
        catch(Exception e){}
    }
}
