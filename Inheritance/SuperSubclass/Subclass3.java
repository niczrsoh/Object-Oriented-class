package Inheritance.SuperSubclass;

public class Subclass3 extends Superclass3{
    Subclass3(){
        //implicit call
        System.out.println("This is a subclass");
    }
    public void showValue(int ar){
        System.out.println("The subclass: "+ar);
    }
    public void showValue(double a){
        System.out.println(a);
    }
}
