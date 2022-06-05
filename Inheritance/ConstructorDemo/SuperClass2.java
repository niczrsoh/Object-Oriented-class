package Inheritance.ConstructorDemo;

public class SuperClass2  {
    public SuperClass2()   { // Constructor #1
       System.out.println("This is the superclass " +
                           "no-arg constructor.");
    }
     public SuperClass2(int arg) { // Constructor #2
       System.out.println("The following argument was" +
     "passed to the superclass constructor: " + arg);     
    }
 } 
 
