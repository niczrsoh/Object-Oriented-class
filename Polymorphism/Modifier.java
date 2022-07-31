package Polymorphism;

class Animal{
    //protected can only access in same class,subclass,same package
    //protected cannot be accessed from other package if creating this object there 
    protected String name;
    Animal(String name){System.out.println("This is a Animal class");
   
this.name = name;}
Animal(){System.out.println("Animal with default name");name="Nemo";}
    protected void name(){System.out.println("This is a Animal");}
}
class Horse extends Animal{
    //can access name
    Horse(String name){
        super(name);
        System.out.println("This is a Horse class");}
    //can strengthen the accessibilty but cannot weaken !!
   // private void name(){System.out.println("This is a Horse")}=> error
    public void name(){System.out.println("This is a Horse");}
}
class Cat{
    Animal a = new Animal();
    //can access name also!
    Cat(String name){
        a.name = name;
    }
}
final class Dog{
    //cannot be extended!!
    final void bark(){
        //cannot be overriden by its subclass if the class not a final
    }
}
public class Modifier {
    
}
