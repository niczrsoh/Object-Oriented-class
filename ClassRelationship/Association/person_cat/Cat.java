/*
Name : Soh Zen Ren
Matric No : A20EC0152
*/
package Association.person_cat;
public class Cat{
    private String name;
    private int age;
    private int yearAdopt;
    Cat(String name, int age, int yearAdopt){
        this.name = name;
        this.age = age;
        this.yearAdopt = yearAdopt;
    }
    String getName(){return name;}
    int getAge(){return age;}
    int calcnumOfYear(){return 2022-yearAdopt;}
}
