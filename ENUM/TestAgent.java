package ENUM;
/*
Name: Soh Zen Ren
Matric No: A20EC0152
*/

import java.util.*;


public class TestAgent {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numOrder;
        System.out.print("Number of package ordered: ");
        numOrder= sc.nextInt();
        System.out.println("Package [NILAM, AQIQ, DELIMA, ZAMRUD] \n");
        double total=0;
        Agent[] obj = new Agent[numOrder];
        for(int i=0; i<numOrder; i++){
            System.out.printf("Package [%d] \n",i+1);
            System.out.print("Package type: ");
            String type = sc.next().toUpperCase();
            switch(type){
                case "NILAM":
                    obj[i]=Agent.Nilam;
                    break;
                case "DELIMA": 
                    obj[i]=Agent.Delima;
                    break;
                case "AQIQ":
                    obj[i]=Agent.Aqiq;
                    break;
                default:
                    obj[i]=Agent.Zamrud;
                    break;
            }
            System.out.printf("Package info: RM %.2f/%s \n",obj[i].getCost(),obj[i].getDetail(obj[i]));
            System.out.printf("Commission rate: %.1f%% per total cost \n",obj[i].getCommission());
            int numPerson= obj[i].readInput();
            double tCost=numPerson*obj[i].getCost();
            double tCommission = obj[i].calcCommission(tCost);
            System.out.printf("Total cost: RM%.2f \n",tCost);
            System.out.printf("Total commission: RM%.2f \n\n",tCommission);
            total+=tCommission;
           
        }
        System.out.println("TOTAL INCOME: RM"+total);
        System. out. println("Press enter to continue . . .");
        try{System. in. read();}
        catch(Exception e){}
    }
}
