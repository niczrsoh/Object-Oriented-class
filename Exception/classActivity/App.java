package Exception.classActivity;

//SOH ZEN REN A20EC0152
import java.util.Scanner;

public class App {
    static int num;
    static int total;
    static int readUserInput() throws InvalidChoice{
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Enter an integer: ");
            num=scanner.nextInt();
            if(num<0)
                //if it is a negative number then throw the NegativeNumber object
                throw new NegativeNumber("Error! It is a negative number!");
            //add the positive number to the total
            total+=num;
        }catch(NegativeNumber n){
           System.out.println("");
        }
        return total;
    }
    static void chooseMenu() throws InvalidChoice{
        int choice;
        Scanner scanner = new Scanner(System.in);
try{
        System.out.println("1. Enter an integer \n2. Quit from the program");
        choice = scanner.nextInt();
        if(choice==1){
           //read menu input when choice is 1
           System.out.printf("Total: %d\n\n",readUserInput());
        }else if(choice==2){
            //exit the program when choice is 2
            System.exit(0);
        }else{throw new Exception("");}}
        catch(Exception e){
            throw new InvalidChoice("This is an invalid choice!");
        }
    
    }
    public static void main(String[] args){
        //while the program is not exit, the program is continue inn the loop
        while(true){
        try{
        chooseMenu();}
        catch(InvalidChoice e){
            System.out.println("");
        }}
    }
}
