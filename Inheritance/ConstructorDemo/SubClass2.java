package Inheritance.ConstructorDemo;

public class SubClass2 extends SuperClass2 {
	public SubClass2() {  // Constructor
      //if super is not declared then implicit call 
      super(10); // explicit call
      System.out.println("This is the " +
                 "subclass constructor.");
   }
} 

