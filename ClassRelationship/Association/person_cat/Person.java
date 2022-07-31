/*
Name : Soh Zen Ren
Matric No : A20EC0152
*/
package Association.person_cat;

public class Person {
    private String name;
    private String address;
    private Cat[] myCat;
    private int num;
    Person(String name, String address){
        this.name = name;
        this.address = address;
        myCat = new Cat[500];
    }
    void adopt(Cat c){
        myCat[num] = c;
        num++;
    }
    void print(){
        System.out.println("Name    :"+ name);
        System.out.println("Address :"+ address);
        System.out.println("List of adopted cats: ");
        for(int i=0; i<num; i++){
            System.out.println("Name     :"+myCat[i].getName());
            System.out.println("Number of years :"+myCat[i].calcnumOfYear());
        }
    }
}
