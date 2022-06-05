package Inheritance.classExercise;

//Soh Zen Ren A20EC0152
//Using abstarct for inheritance
abstract class Shape{
String name;
  Shape(){}
  abstract double calcArea();
}
class Circle extends Shape{
    protected double radius;
    Circle(double radius,String name){
        this.name = name;
        this.radius = radius;
    }
    double calcArea(){return Math.PI * Math.pow(radius, 2);}
}
class Rectangle extends Shape{
    double length;
    double width;
    Rectangle(double length, double width,String name){
        this.name = name;
        this.length = length;
        this.width= width;
    }
    double calcArea(){return width*length;}
}
class Triangle extends Shape{
    double length;
    double height;
    Triangle(double length, double height,String name){
        this.name = name;
        this.length = length;
        this.height = height;
    }
    double calcArea(){return 0.5*height*length;}
}
class Cone extends Circle{
    double height;
    Cone(double radius, double height,String name) {
        super(radius,name);
        this.height = height;
    }
    double calcArea(){
        return Math.PI*radius*(radius+Math.sqrt(Math.pow(height,2)+Math.pow(radius,2)));
    }
}
class Cylinder extends Circle{
    double height;
    Cylinder(double radius, double height,String name) {
        super(radius,name);
        this.height = height;
    }
    double calcArea(){
        return 2*Math.PI*radius*height+2*Math.PI*Math.pow(radius,2);
    }
}
public class TestApplication {
    public static void main(String[] args) {
        Shape[] shape = new Shape[5];
        shape[0] = new Triangle(3.0,5.0,"Triangle");
        shape[1] = new Cylinder(3.0,5.0,"Cylinder");
        shape[2] = new Circle(3.0,"Circle");
        shape[3] = new Cone(3.0,5.0,"Cone");
        shape[4] = new Rectangle(3.0,5.0,"Rectangle");
        for(Shape sh:shape){
            System.out.printf("%s's area: %.2f\n",sh.name,sh.calcArea());
        }
    
    }
}
