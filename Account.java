import java.util.Scanner;
import java.io.*;
//learn about input and output file using java
// this class is used to input & output the data from input file to output file
public class Account{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner inputFile = new Scanner(new File("D:/AccountData.txt"));
        int[] data1 = new int[4];
        double[] data2 = new double[4];
        String[] names =new String[4];
        for(int i=0;i<4;i++){
            data1[i]=inputFile.nextInt();
            data2[i]=inputFile.nextDouble();
            names[i]=inputFile.nextLine();
        }
        inputFile.close();
        PrintWriter outputFile = new PrintWriter("D:/AccountReport.txt");
        outputFile.println("Account   Owner             Balance before    Balance after");
        for(int i=0;i<4;i++){
            outputFile.format("%-9s",data1[i]);
            outputFile.format("%-19s",names[i]);
            outputFile.format("%-18s",String.format("$ %.2f", data2[i]));
            outputFile.format("%-18s",String.format("$ %.2f", data2[i]*110/100));
            outputFile.println();
        }
        outputFile.close();
    }
}