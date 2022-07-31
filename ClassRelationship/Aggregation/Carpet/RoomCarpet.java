package Aggregation.Carpet;

public class RoomCarpet {
    private RoomDimension size;
    private double carpetCost;
    RoomCarpet(RoomDimension size, double carpetCost){
        this.size = size;
        this.carpetCost = carpetCost;
    }
    double getTotalCost(){
        return size.getArea()*carpetCost;
    }
    public String toString(){
        return String.format("Total Cost: RM %.2f",getTotalCost());
    }
}
