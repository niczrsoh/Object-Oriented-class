/*
Name : Soh Zen Ren
Matric No : A20EC0152
*/
package Association.courses;

public class TestAssociate {
    public static void main(String[] args){
        Course cs1 = new Course("OOP","SECJ2154",7);
        Course cs2 = new Course("OS","SECR2043",5);
        Course cs3 = new Course("SE","SECJ2203",8);
        Course cs4 = new Course("WP","SECV1223",6);
        Lecturer l1 = new Lecturer("Dr. Norsham");
        l1.teach(cs1);
        l1.teach(cs2);
        l1.teach(cs3);
        l1.printAllInfo();
        Student s1 = new Student("Ali","A02","Software");
        s1.register(cs1);
        s1.register(cs4);
        s1.printAllInfo();
    }
}
