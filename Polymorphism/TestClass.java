package Polymorphism;
public class TestClass{
    public static void main(String[] args){
        ClassA c= new ClassC();
        c.method1();
        ClassA b = new ClassB();
        b.method2(3);
    }
}
class ClassA{
    public ClassA(){}
    public void method1() {
        System.out.println("Class A");
    }
    public void method2(int a) {
        System.out.println("Class A: "+a);
    }
}
class ClassB extends ClassA{
    ClassB(){}
    public void method1() {
        System.out.println("Class B");
    }
}
class ClassC extends ClassB{
    ClassC(){}
    public void method1() {
        System.out.println("Class C");
    }
}