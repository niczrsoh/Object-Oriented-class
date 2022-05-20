package Input_Output;
import java.util.Scanner;
/*
 - Is required to import javax.swing.JOptionPane if intending to use JOptionPane
 - JOptionPane class provides methods to display each type of dialog box.
 - JOptionPane.showMessageDialog is use to display the message dialog.
 - JOptionPane.showInputDialog("Enter your name.");
 - Integer.parseInt("1234"), Byte.parseByte("23"), Short.parseShort("12"),
 - Double.parseDouble("23.45"), Long.parseLong("246810"), Float.parseFloat("123.45")  
*/
import javax.swing.JOptionPane;
//learn about JOptionPane in Java
public class Land{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length,width,area;
        String str;
        str = JOptionPane.showInputDialog("Enter A number");
        length=Integer.parseInt(str);
        str = JOptionPane.showInputDialog("Enter A number");
        width=Integer.parseInt(str);
        area= length*width;
        JOptionPane.showMessageDialog(null,"length: "+length+"cm"+"\n width: "+"cm"+width+"\n area: "+area+"cm");
        System.exit(0);
    }}