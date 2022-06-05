package Inheritance;

public class Rectangle {
    private double width;
    private double length;

    Rectangle(double _w, double _l){
        width = _w;
        length = _l;
    }
    protected double calculateArea(){
        return width * length;
    }
    public void display(){
        System.out.println(width); 
        System.out.println(length);
    }

}
