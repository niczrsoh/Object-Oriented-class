package Polymorphism;

class Animal{
    String name;
    Animal(){System.out.println("This is a Animal class");}
    void name(){System.out.println("This is a Animal");}
}
class Horse extends Animal{
    Horse(){System.out.println("This is a Horse class");}
    void name(){System.out.println("This is a Horse");}
}
public class cast {
    public static void main(String[] args){
    //casting in primitive type 
    //range increase from byte, short, int, long, float, double
    int a =3;
    //WIDENING
    double d = a; //casting a variable a which is smaller range to variable d.
   // short e=d;=> gives error due to assign to a smaller range variable
   //thus casting is useful here 
    //NARROWING 
    short e = (short)d;
    //assigns the object new Horse() to a parameter of the Object type
    Object obj = new Horse();//implicit casting
    // Horse h1 = obj; => come out error since an object is not an instance of Horse
    // but Horse is always an instance of Object. 
    // Thus using cast here!!
     Horse h1 = (Horse)obj;//explicit casting

    Object obj2 = new Horse();
 
    //obj2.name(); => gives error due to the need to casting it
    //The need to ensure that the object is an instance before casting it!
    if(obj2 instanceof Animal){
        ((Horse)obj2).name();
    }
    //An instance of a subclass is always an instance of the superclass!!
    //Casting an instance of a superclass to a variable of its subclass need explicit casting!!
    //EX:
    Animal a1 = new Horse();
    Horse h2 = (Horse)a1; 
    System.out.println(h2 instanceof Animal);}
}
