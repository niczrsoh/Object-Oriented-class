package ENUM;
/*
Name: Soh Zen Ren 
Matric No: A20EC0152
*/
import java.util.Scanner;
//JUST A FILE & THE MAIN IS INSIDE THIS ENUM
public enum Message{
    Red("Acidic Substance"),Blue("Basic Material"),Purple("Neutral");

    private final String message;

    Message(String m){
        message = m;
    }
    public String getMessage(){
        return message;
    }

    public static void main (String[] args) {
        System.out.print("Please enter the color of the liquid: ");
        Scanner scanner = new Scanner(System.in);
        String ans = scanner.next();
        Message chosen;
        switch(ans){
            case "Red":
                chosen=Message.Red;
                break;
            case "Blue":
                chosen=Message.Blue;
                break;
            //by default will be purple
            default:
                chosen=Message.Purple;
                break;
        }
        System.out.println(Red.ordinal());
        System.out.println(chosen.compareTo(Message.Blue));
        System.out.println("The message of the selected color: "+ chosen.getMessage());
        //garbage collection for deallocating the memory
        System.gc();
        System.out.println("The created object is now disposed");
    }
}