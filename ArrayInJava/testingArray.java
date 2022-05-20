package ArrayInJava;
import java.util.Scanner;

public class testingArray{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[] num=new int[6];
        for(int i=0;i<6;i++){
            System.out.print("Enter number "+(i+1)+" : ");
            num[i]=sc.nextInt();
        }
        int biggest=num[0];
        for(int j:num){
            if(j>biggest)
                biggest=j;}
        int count=0;
        for(int k:num){
            if(k==biggest)
                count++;}
        System.out.println("The biggest number is "+biggest);
        System.out.println("The number of occurrences of the biggest number is "+count);
    }
}