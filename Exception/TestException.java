package Exception;

import java.io.*;
public class TestException {
   public static void main (String[] args) throws IOException {
    try {
     // int a =1/0;
      method();
      System.out.println("After method call");
    }
    catch (ArithmeticException ex ){
      System.out.println("ArithmeticException");
    }
    catch (RuntimeException ex ){
      System.out.println("RunTimeException");
    }
    catch (Exception ex ){
      System.out.println("Exception");
    }
   }
static void method() throws Exception { 
 try{   
  String s="abc";
     System.out.println(s.charAt(3));
 }
 catch (RuntimeException ex ){
  System.out.println("RunTimeException in method()");
 }
 catch (Exception ex ){
  System.out.println("Exception in method()");
 }
}

}
