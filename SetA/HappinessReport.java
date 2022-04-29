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
        Vector<Country> country=new Vector<Country>();
        String levelFile, factorFile, countryFile;
        int high=0, medium=0, low=0, not=0;
        while(inputFile.hasNextLine())
        {
            LevelList ll;
            levelFile=inputFile.next();
            countryFile=inputFile.next();//name
            factorFile=inputFile.nextLine();//factor
            ll= LevelList.valueOf(levelFile.toUpperCase());
            switch(levelFile.toUpperCase()){
                case "LEVEL1": high++; break;
                case "LEVEL2": medium++; break;
                case "LEVEL3": low++; break;
                default: not++;
            }
            Country country1 = new Country(countryFile, factorFile, ll.getIndex(),ll.getCategoryLevel());
            country.addElement(country1);
            
            //country.addElement(Country(countryFile, factorFile, levelFile, categoryFile));
            //country.addElement(Country(levelFile, countryFile, factorFile));
        }
        inputFile.close();
        
        System.out.println("Category of Happiness");
        for(LevelList l: LevelList.values())
        {
            System.out.printf("%-10s%.1f", l, l.getIndex());
            System.out.println("\t\t"+l.getCategoryLevel());
        }
        System.out.println("\n");
        System.out.printf("%50s", "COUNTRY INDEX HAPPINEST REPORT\n");
        System.out.printf("%-8s%-20s%-20s%-8s%-30s\n", "Level", "Factor", "Country", "Index", "Category");
        int count=1;
        for(Object o:country){
            System.out.printf("%-8s%-80s\n",count,o.toString());
            count++;
        }
        System.out.println();
        System.out.println("Total in HIGH HAPPINESS = "+ high);
        System.out.println("Total in MEDIUM HAPPINESS = "+ medium);
        System.out.println("Total in LOW HAPPINESS = "+ low);
        System.out.println("Total in NOT HAPPY = "+ not);
        System.out.println("Total Countries = "+ Country.total);
        System.out.print("\nPress any key to continue ...");
        try{System. in. read();}
        catch(Exception e){}
    }
 
}