
import java.util.*;
public class Customer{
    private String paymentMode;
    private Name name;
    private Address add;
    private Vector<Pizza>pizzaList;
    private final double DELIVERY_CHARGE=5;
    
    //Customer compose with Name 
    //Customer associate with pizza  
    //Customer aggregate with address
    public Customer(String p, String fn, String ln, Address a)
    {
        paymentMode=p;
        name=new Name(fn, ln);//composition
        add=a;//aggregation
        pizzaList=new Vector <Pizza>();//association
    }

    public void order(Pizza p)
    {
        pizzaList.addElement(p);
    }
    
    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Address: "+add);
        System.out.println("Number of ordered pizza: "+ pizzaList.size());
        double total=0, pDisc, totalC;
        for(int i=0; i<pizzaList.size(); i++)
        {
            System.out.printf("%d)\t%-20s%-10sRM %.2f\n", (i+1), pizzaList.get(i).getDescription(), pizzaList.get(i).getPizzaSize().getSize(), pizzaList.get(i).getPizzaSize().getPrice());
            total+=pizzaList.get(i).getPizzaSize().getPrice();
        }
        System.out.printf("\nTotal price: RM %.2f\n",total);
        if(paymentMode.equals("Online"))
        {
            pDisc=total*0.9;
        }
        else {
            pDisc=total;
        }
        totalC=pDisc+DELIVERY_CHARGE;
        System.out.printf("Price after discount: RM %.2f\n",pDisc);
        System.out.printf("Total Charge: RM %.2f\n",totalC);
    }
}