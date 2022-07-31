package Polymorphism;

class Animal {
    public void eat() {
       System.out.println("Generic Animal Eating Generically");
    }
 }
 class Horse extends Animal {
    public void eat() {
        System.out.println("Horse eating hay, oats, "
                            + "and horse treats");
    }
    public void buck() {
       System.out.println ("This is how I jump");
    }
 }
 public class TestAnimals2 {
   public static void main (String [] args) {
     Animal a = new Animal();
     Animal b = new Horse();//Animal ref but Horse version.
     a.eat();
     //override the parent method
     b.eat();
     Animal c = new Horse();//Animal ref, but Horse version
     //there is no buck method in parent thus cannot be overriden here
	// c.buck();//give compilation error

   }
 }
 
