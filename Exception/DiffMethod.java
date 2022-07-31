package Exception;

public class DiffMethod {
    public void metod1(int i,int j){
        try{metod2(i,j);}
        catch(ArithmeticException e){
            System.out.println("i="+i+"\tj="+j);
            e.printStackTrace();
            System.out.println("This is your problem:"+e.getMessage());
        }
    }
    public void metod2(int i,int j) throws ArithmeticException{
        System.out.println("metod2 bermula");
        j=i/j;
        System.out.println("metod2 berakhir");
    }
    public static void main(String[] args){
        DiffMethod p = new DiffMethod();
        p.metod1(1, 1);
        p.metod1(1, 0);
    }
}
