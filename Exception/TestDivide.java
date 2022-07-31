package Exception;

import java.util.*;
public class TestDivide{
  public static void main(String args[]){
     try {
        Scanner scanner = new Scanner(System.in);

     System.out.print ("Enter the denom value:");
        int denom = scanner.nextInt();
        if (denom<0)
            throw new NumberFormatException("Not a positive denom!!");
        System.out.println ("The value of 100/" + denom +": "+ 100/denom);
  }
  catch (ArithmeticException ex) {
     System.out.println ("Division by zero error!");
   }

   catch (InputMismatchException ex) {
      System.out.println ("Wrong input data!");
   }

   catch (NumberFormatException ex) {
       System.out.println (ex.getMessage());
   }
  }
}
