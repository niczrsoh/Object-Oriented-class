package ArrayInJava;
import java.util.ArrayList;
class Area{
    double radius;
    Area(double radius){
        this.radius = radius;
    }
    double getRadius(){
        return radius;
    }
    double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    public String toString(){
        return "Area: "+getArea()+"cm^2";
    }
}
//add, toString, remove, set, get, size()
public class ArrayList01 {
    public static void main(String[] args){
    //using type-safe array list by using generics so that can no longer cast the get method
    //to emphasize the arraylist only take object-typed elements and initialize the list with 5 capacity  
    ArrayList<Object> test1 = new ArrayList<Object>(5);
    //initialize 3 objects from class Area
    Area a1= new Area(13);
    Area a2=new Area(20);
    Area a3=new Area(40);
    //add these objects into area class
    test1.add(a1);
    test1.add(a2);
    test1.add(a3);
    //declare the size of the arraylist
    System.out.printf("There are %d objects \n",test1.size());
    //get the info of each object using toString()
    for(Object a:test1){
      System.out.println(a.toString()); 
    }
    System.out.println("Get the 2nd object radius: \n"+(double)a2.getRadius());
    System.out.println("\n After remove the 2nd object");
    //remove the 2nd object from the list by using index
    test1.remove(1);
    for(Object a:test1){
        System.out.println(a.toString()); 
      }
      System.out.println("\n After remove the 1st object");
    //remove the 1st object from the list by using object
      test1.remove(a1);
      for(Object a:test1){
          System.out.println(a.toString()); 
        }
    System.out.println("\n After reset the 3rd object with 25 cm radius");
    //set the last object with 25 radius and get the area of the object
    test1.set(0,new Area(25));
    System.out.println(test1.toString()); 
    }
}
