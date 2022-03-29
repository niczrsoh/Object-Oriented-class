import java.util.Scanner;
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
    }}