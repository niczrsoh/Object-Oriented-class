package Vector;
import java.util.Scanner;
import java.util.Vector;
class Course{
    private String name;
    private String code;
    Course(String name,String code){
        this.name = name;
        this.code = code;
    }
    String getName(){return name;}
    String getCode(){return code;}
}
public class Falkulti {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Vector<Course> obj = new Vector<Course>();
        Course c = new Course("OOP","SECJ");
        Course c2 = new Course("NC","SECR");
        Course c3 = new Course("WP","SECV");
        Course c4 = new Course("SE","SECJH");
        obj.addElement(c);
        obj.addElement(c2);
        obj.addElement(c4);
        System.out.printf("%-10s %-5s \n","Name","Code");
        for(Course o : obj){
            System.out.printf("%-10s %-5s\n",o.getName(),o.getCode());
        }
       
        obj.insertElementAt(c3, 2);
        System.out.println("After an element has been added in the third order");
        for(Course o : obj){
            System.out.printf("%-10s %-5s\n",o.getName(),o.getCode());
        }
        //obj removes the first and second element
        obj.removeElement(c);
        obj.removeElementAt(0);
        System.out.println("After the first and second elements have been removed");
        for(Course o : obj){
            System.out.printf("%-10s %-5s\n",o.getName(),o.getCode());
        }

        System.out.println("The first course now is "+obj.elementAt(0).getName());
        obj.addElement(new Course("HEP","GHSAD"));
    }
    
}
