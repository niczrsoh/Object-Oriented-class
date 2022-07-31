package Inheritance;

import Inheritance.Rectangle;

public class Square extends Rectangle{
    double height;
    public Square(){
        super(10, 15);
        System.out.println("Derived class");
        height= 10;
    }
    public double calculateVolume(){
        return super.calculateArea()*height;
    }
    public void display(){
        super.display();
        System.out.println(height);
        System.out.println(calculateVolume());
    }
}
