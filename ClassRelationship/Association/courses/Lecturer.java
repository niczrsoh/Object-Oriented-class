/*
Name : Soh Zen Ren
Matric No : A20EC0152
*/
package Association.courses;

public class Lecturer {
    private String name;
    private Course courseList[];
    private int numOfCourse;
    Lecturer(String name){
        this.name = name;
        courseList = new Course[3];
    }
    String getName(){return name;}
    int getNumOfCourse(){return numOfCourse;}
    void teach(Course course){
        courseList[numOfCourse] = course;
        numOfCourse++;
    }
    void printAllInfo(){
        System.out.println("\nLECTURER NAME: " + name);
        System.out.println("NUMBER OF COURSE: "+ numOfCourse);
        System.out.println("LIST OF COURSES: ");
        for(int i=0;i<numOfCourse;i++){
            Course a=courseList[i];
            System.out.println((i+1)+"."+a.getName());
        }
    }
}
