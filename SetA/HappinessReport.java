// COMPILE & RUN THE CODE HERE
// THIS LAB INCLUDES ENUM , FILE, CLASS , VECTOR ,ENHANCED FOR LOOP, FORMATTING & STATIC IN JAVA
// SOH ZEN REN A20EC0152
// THERESA LAU XIN YI A20EC0167
package SetA;
import java.util.*;
import java.io.*;

public class HappinessReport
{
    public static void main(String[]args) throws FileNotFoundException
    {
        Scanner inputFile=new Scanner(new File("InputSA.txt"));
        //create a vector object by getting the class Country
        Vector<Country> country=new Vector<Country>();
        String levelFile, factorFile, countryFile;
        int high=0, medium=0, low=0, not=0;
        //read the file
        while(inputFile.hasNextLine())
        {
            LevelList ll;
            levelFile=inputFile.next();
            countryFile=inputFile.next();//name
            factorFile=inputFile.nextLine();//factor
            ll= LevelList.valueOf(levelFile.toUpperCase());//set all the chars in uppercase to match with the enum object's name
            switch(levelFile.toUpperCase()){
                case "LEVEL1": high++; break;
                case "LEVEL2": medium++; break;
                case "LEVEL3": low++; break;
                default: not++;
            }
            //create a Country object by getting the country name, factor, index and cataegory level 
            Country country1 = new Country(countryFile, factorFile, ll.getIndex(),ll.getCategoryLevel());
            //add the object into the vector
            country.addElement(country1);
        }
        inputFile.close();
        
        System.out.println("Category of Happiness");
        //using enhanced for loop to declare list of index and category levels
        for(LevelList l: LevelList.values())
        {
            System.out.printf("%-10s%.1f", l, l.getIndex());
            System.out.println("\t\t"+l.getCategoryLevel());
        }
        System.out.println("\n");
        System.out.printf("%50s", "COUNTRY INDEX HAPPINEST REPORT\n");
        System.out.printf("%-8s%-20s%-20s%-8s%-30s\n", "Level", "Factor", "Country", "Index", "Category");
        int count=1;
        //display info of each object using enhanced for-loop & toString() method 
        for(Object o:country){
            System.out.printf("%-8s%-80s\n",count,o.toString());
            count++;
        }
        System.out.println();
        System.out.println("Total in HIGH HAPPINESS = "+ high);
        System.out.println("Total in MEDIUM HAPPINESS = "+ medium);
        System.out.println("Total in LOW HAPPINESS = "+ low);
        System.out.println("Total in NOT HAPPY = "+ not);
        //get the total number by using static variable in Country class
        System.out.println("Total Countries = "+ Country.total);
        System.out.print("\nPress any key to continue ...");
        try{System. in. read();}
        catch(Exception e){}
    }
 
}