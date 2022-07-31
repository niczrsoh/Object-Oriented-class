package ProblemSolving;

import java.util.ArrayList;
import java.util.Scanner;

public class PassengerApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice;
        ArrayList<Passenger> passengerList = new ArrayList<Passenger>();
        Destination destination;
        Passenger passenger;
        Baggage baggage; 
        do{
        displayMenu();
        choice = scanner.nextInt();
        switch (choice){
            case 1:
                String fName,lName,city,country;
                int noBag;
                char seat;
                scanner.nextLine();
                System.out.println("\n++++++ Add Passenger +++++");
                System.out.print("First Name: ");fName=scanner.nextLine();
  
                System.out.print("Last Name: ");lName=scanner.nextLine();
                
                System.out.println("Destination: ");
                System.out.print("City: ");city=scanner.nextLine();
                
                System.out.print("Country: ");country=scanner.nextLine();
               
                destination = new Destination(city,country);
                System.out.print("Seat [F-First, B-Business, E-Economy]: ");seat=scanner.next().toUpperCase().charAt(0);
                String mySeat = String.valueOf(seat);
                passenger = new Passenger(mySeat,fName,destination,lName);
              
                System.out.print("Number of baggage: ");noBag=scanner.nextInt();
            
                int[] bag = new int[noBag];
                for(int i=0;i<noBag;i++){
                    System.out.print("Bag "+i+1+" (in kg): ");
                    bag[i]=scanner.nextInt();
                    baggage = new Baggage(bag[i]);
                    passenger.checkIn(baggage);
                  
                }
                passengerList.add(passenger);
                break;
                case 2: 
                int i=1;
                for(Passenger mypassenger : passengerList){
                    System.out.println("\nPassenger #"+i++);
                    mypassenger.display();
                }
                break;
        }
    }while(choice!=3);
    System.out.println("Thank you for using this system :)");
    try{System.in.read();}catch(Exception e){}
    }
    public static void displayMenu() {
        System.out.println("------------------------------------------");
        System.out.println("\tCheck-In Baggage System");
        System.out.println("------------------------------------------");
        System.out.println("[1] Add Passenger");
        System.out.println("[2] Display Passengers");
        System.out.println("[3] Exit");
        System.out.print("Your choice: ");
        }
}
