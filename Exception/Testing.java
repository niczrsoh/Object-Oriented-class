package Exception;

import java.util.Scanner;

public class Testing {
    public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
           int[] array= new int[5];
           try{
                for(int i=0;i<6;i++){
                System.out.print("Enter integer: ");
                array[i]=sc.nextInt();}
           }catch(ArrayIndexOutOfBoundsException e){
               System.out.println("You have exceeded the array index");
           }
        }
    }
    
