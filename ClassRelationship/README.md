Relationships among classes
1. association 
2. aggregation
3. composition
4. inheritance

1. Association
- a general binary relationship that describes an activity between two classes with the multiplicity 
- objects call methods in other objects 
- object references
- one-to-many no nid to create an associative class
- arrow specifies navigability in class diagram 
- no arraow implies bidirectional navigability
- many-to-many nid to create an associative class
- associative class is an instance of association class
- entirely possible for a class to have an association to itself
- ex: 
class Course{
    private Student[] student;
    Course()
{
    student = new Student[60];
}
public void addStudent(Student s){}
} 
class Student{
    Course[] course;
    int numCourse;
    Student(){ course = new Course[60]; }  
    public void rgeisterCourse(Course cs){}
}

2. Aggregation
- a special form of association
- an ownership relationship between two classes
- has-a relationship
- usually represented as a data field in the aggregated class. 
- object is created outside the aggregated class.
- ex:
class PC{
    private RAM r;
    private Mouse m;
    public PC(RAM r,Mouse m){
        this.r=r; this.m=m;
    }
}
main(){
    RAM r1 = new RAM(...,...);
    Mouse m1 = new Mouse(...);
    PC p1 = new PC(r1,m1);
}

3. Composition
- form of aggregation
- "contains a" relationship
- strong ownership/ binding
- belong to one whole 
- do not change during execution
- the object is created inside the composed class  
- ex:
class Person{
    private Name name; 
    Person(){
        name = new Name("Dylan","Wong");
    }
}