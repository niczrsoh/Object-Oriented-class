package ArrayInJava.ArrayMixedObject;
import java.util.ArrayList;

import ArrayInJava.Employee;
import mypackage.bentuk.Bulatan;

public class ArrayMixedObjects {
public static void main (String[] args) {
  // (a) create an ArrayList named mixedObject
  ArrayList <Object> mixedObject = new ArrayList<Object>();
  // (b)create object of Bulatan, Student and Employee and add to ArrayList mixedObject	
  Bulatan bulatan = new Bulatan(2, 3, 4);
  Student student = new Student("Nick",3.99);
  Employee employee = new Employee("Dr Nosham","Lecturer",10000);
  mixedObject.add(bulatan);
  mixedObject.add(student);
  mixedObject.add(employee);
// (c)display info of each object by invoking display() method in respective class
  System.out.println("---Display info of each object by invoking display() method in respective class---\n");
  bulatan.display();
  student.display();
  employee.display();
  for(int i=0;i<100;i++){System.out.print("-");}
  System.out.println("\n ------Display Info using enhanced loop & to String-----\n");
//(d) display info of each object using enhanced for-loop & toString() method in respective class
  for(Object arrayList:mixedObject){
     System.out.println(arrayList.toString());
  }
  }
}