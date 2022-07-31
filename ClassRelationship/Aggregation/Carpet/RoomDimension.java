package Aggregation.Carpet;

public class RoomDimension {
    private double length;
    private double width;
    RoomDimension(double length, double width){
        this.length = length;
        this.width = width;
    }
    double getArea(){return length*width;}
    public String toString(){return "Area: "+getArea();}
}
