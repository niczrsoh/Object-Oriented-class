package Exception;
//SOH ZEN REN A20EC0152

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    try{
        int age,birth;
        System.out.print("Year of birth: ");
        birth=sc.nextInt();
        age=2009-birth;
        if(age<16){
            throw new Exception("Error! The age is less than 16!");
        }
        int drive= age-16;
        int charge;
        if(drive<4){
            charge=1000 * drive;
        }else{
            charge=600 * drive;
        }
        System.out.println("Charge: RM"+charge);
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    }
}
