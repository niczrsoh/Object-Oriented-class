package Aggregation.Carpet;

import java.util.Scanner;

public class TestRoom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double len,wid,price;
        System.out.println("Enter the dimensions of the room in meter: ");
        System.out.print("    Length: ");
        len=sc.nextDouble();
        System.out.print("    Width: ");
        wid=sc.nextDouble();
        RoomDimension rd = new RoomDimension(len,wid);
        System.out.print("Enter the price per square meter of the desired carpet: ");
        price=sc.nextDouble();
        RoomCarpet rc = new RoomCarpet(rd,price);
        System.out.println(rc.toString());
    }
}
