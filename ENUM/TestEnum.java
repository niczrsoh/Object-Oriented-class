package ENUM;

import java.util.Scanner;


class MyAssessment{
    enum CourseWorks{
        Test(30), Quiz(15), Exercise(15);
    
    public int mark;
    private CourseWorks(int mark) {
        this.mark = mark;
    }}
}
public class TestEnum{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //CourseWorks cw = MyAssessment.CourseWorks.Quiz; //should give error
        MyAssessment.CourseWorks cw = MyAssessment.CourseWorks.Test; //when want to access enum from a class
        //CourseWorks cw = new CourseWorks(); //should give error
        System.out.println("The ordinal value for " + MyAssessment.CourseWorks.Quiz + " is " + MyAssessment.CourseWorks.Quiz.ordinal());
        System.out.println("The difference of sequence between Quiz and Test is " + MyAssessment.CourseWorks.Quiz.compareTo(MyAssessment.CourseWorks.Test));
        if (MyAssessment.CourseWorks.Quiz.mark == MyAssessment.CourseWorks.Exercise.mark){ //when to compare the value of two enum constants
            System.out.println("same");
        }else{
            System.out.println("different");
        }
    }

    
}