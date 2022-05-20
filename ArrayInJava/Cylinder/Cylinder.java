package ArrayInJava.Cylinder;

public class Cylinder {
    double height;
    double radius;
    Cylinder(double height, double radius){
        this.height = height;
        this.radius = radius;
    }
    void setHeight(double height){
        this.height = height;
    }
    void setRadius(double radius){
        this.radius = radius;
    }
    double getHeight(){
        return height;
    }
    double getRadius(){
        return radius;
    }
    double calArea(){
        return 2*Math.PI*radius*height+2*Math.PI*Math.pow(radius,2);
    }
    double calVol(){
        return (Math.PI)*(Math.pow(radius,2))*height;
    }
}
