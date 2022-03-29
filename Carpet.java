import java.util.Scanner;
//learn about formating in Java
public class Carpet{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String brandName;
        double length, width;
        double area;
        System.out.print("Enter the carpet brand:");
        brandName = input.next();
        System.out.print("Enter the carpet length:");
        length = input.nextDouble();
        System.out.print("Enter the carpet width:");
        width = input.nextDouble();
        area=width*length;
        System.out.print("The area of carpet of "+(int)length+" x "+(int)width);
        System.out.printf(" is RM "+String.format("%.2f", area));
    }
}