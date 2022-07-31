/*
Name : Soh Zen Ren
Matric No : A20EC0152
*/
package Association.person_cat;
public class AdoptionTest {
    public static void main(String[] args){
        Cat c1 = new Cat("Roman",7,2015);
        Cat c2 = new Cat("Cooper",5,2017);
        Cat c3 =new Cat("Bella",8,2014);
        Person p1= new Person("Ali","MA1, Jalan UTM, Skudai");
        p1.adopt(c1);
        p1.adopt(c2);
        p1.adopt(c3);
        p1.print();
    }
}
