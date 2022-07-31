package ProblemSolving;

import java.util.ArrayList;

public class Passenger {
    private Seat seat;
    private Name name;
    private Destination dest;
    private ArrayList<Baggage> bagList; 
    private final int CHARGE=30;
    public Passenger(String seat, String firstName, Destination dest, String lastName) {
        this.seat= Seat.valueOf(Seat.class, seat);
        this.name = new Name(firstName,lastName);
        this.dest = dest;
        bagList = new ArrayList<Baggage>();
    }
    public void checkIn(Baggage b){
        bagList.add(b);
    }
    public void display(){
        System.out.printf("\n%-11s: %s","Name",name.toString());
        System.out.printf("\n%-11s: %s","Destination",dest.toString());
        System.out.printf("\n%-11s: %s","Seat",seat.getSeatClass());
        System.out.printf("\nNumber of baggage: %d",bagList.size());
        int i=1;
        double total=0,exceed=0,charge=0;
        for(Baggage bag: bagList){
        System.out.printf("\nBag %d : %.1f kg",i++,bag.getWeight());
            total+=bag.getWeight();
    }
    if(total>seat.getAllowWeight()){
        exceed=total-seat.getAllowWeight();
        charge= exceed*30;
    }
        System.out.printf("\n\nTotal Weight: %.1f kg",total);
        System.out.printf("\n Total excess weight: %.1f kg",exceed);
        System.out.printf("\n Total charge: RM %.1f",charge); 
    }
}
