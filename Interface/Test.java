package Interface;
interface A{
    void print();
}
class C{};
class B extends C implements A{
    public void print(){
    }
};
public class Test {
    public static void main(String[] args){
        //the instance refers to the object type which can be determined during the compile time 
        //A b = new A(); //Error! interface cannot be instantiated!
        //B b = new B();//is instance of A & C
        //C b = new C();//is instance of C only
        C b = new B();//is instance of A & C
        if(b instanceof A){
            System.out.println("b is an instance of A");
        }
        if(b instanceof C){
            System.out.println("b is an instance of C");
        }
    }
}
