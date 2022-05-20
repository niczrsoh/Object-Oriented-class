package ArrayInJava.Cylinder;

import java.util.Scanner;

public class TestCylinder {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Cylinder[] cy=new Cylinder[10];
    int i=0;
    for(Cylinder c: cy) { 
        System.out.printf("Enter the height of Cylinder %d : ",(i+1));
        double height = sc.nextDouble();
        System.out.printf("Enter the radius of Cylinder %d : ",(i+1));
        double radius = sc.nextDouble();
        cy[i]=new Cylinder(height, radius);
        i++;
    }
    i=0;
    for(Cylinder c : cy){
        System.out.println("Cylinder "+(i+1));
        System.out.printf("The height of Cylinder %d is %.2f \n",i+1,c.getHeight());
        System.out.printf("The radius of Cylinder %d is %.2f \n",i+1,c.getRadius());
        System.out.printf("The Surface Area of Cylinder %d is %.2f \n",i+1,c.calArea());
        System.out.printf("The Volume of Cylinder %d is %.2f \n",i+1,c.calVol());
        System.out.println();
        i++;
    }
}
}
