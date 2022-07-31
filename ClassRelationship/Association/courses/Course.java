/*
Name : Soh Zen Ren
Matric No : A20EC0152
*/
package Association.courses;

public class Course {
    private String name;
    private String code;
    private int section;
    private Student[] stuList;
    private int numOfStudent;
    Course(String name, String code, int section) {
        this.name = name;
        this.code = code;
        this.section = section;
    }
    String getName() {return name;}
    public void addStudent(Student st){
        stuList[numOfStudent]=st;
        numOfStudent++;
        //this represent the object of this class
        //thus it registers this course
        st.register(this);
    }
}
