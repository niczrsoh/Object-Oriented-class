package ClassRelationship;

/*
Group 6:
1. Soh Zen Ren A20EC0152 
2. Theresa Lau Xin Yi A20EC0167
3. Radin Nazhan Bin Radin Jamzulkomar A20EC0136
*/
import java.util.*;
import java.io.*;
public class CustomerApp{

    public static void displayMenu() {
        System.out.println("------------------------------------------");
        System.out.println(" Pizza Delivery Ordering System");
        System.out.println("------------------------------------------");
        System.out.println("[1] Add Customer");
        System.out.println("[2] Display Customers");
        System.out.println("[3] Exit");
        System.out.print("Your choice: ");
    }
        
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        Vector<Customer> obj = new Vector<Customer>();
        int choice;
        do{
        displayMenu();
        choice = sc.nextInt();
        sc.nextLine();
        switch(choice){
            case 1:
                String fname, lname,addStreet,addCity,payment;
                int no;
                System.out.println("***** Add Customer *****");
                System.out.print("First name: ");
                fname = sc.nextLine();
                System.out.print("Last name: ");
                lname = sc.nextLine();
                System.out.println("Address: ");
                System.out.print("Street: ");
                addStreet = sc.nextLine();
                System.out.print("City: ");
                addCity = sc.nextLine();
                System.out.print("Payment Mode [Online | COD]: ");
                payment = sc.next();
                System.out.print("Number of pizzas: ");
                no = sc.nextInt();
                sc.nextLine();
                Address address = new Address(addStreet,addCity);
                Customer cus= new Customer(payment,fname,lname,address);
                for(int i=0;i<no;i++){   
                  String description; char sz;   
                  System.out.println("Pizza #"+(i+1));
                  System.out.print("Description: ");
                   description = sc.nextLine();
                  System.out.print("Size [S-Small, R-Regular, L-Large]: ");
                   sz = sc.next().charAt(0);
                   String s = String.valueOf(sz);
                   Size size = Size.valueOf(Size.class, s.toUpperCase());
                   Pizza pizza = new Pizza(description, size);
                   cus.order(pizza);
                   sc.nextLine();
                 }
                obj.addElement(cus);
                break; 
            case 2:
                for(int i=0; i<obj.size(); i++)
                { 
                     System.out.println("Customer #"+(i+1));
                    Customer myCust;
                    myCust = (Customer)obj.elementAt(i);
                    myCust.display();
                    System.out.println("");
                }
                break;
            case 3:
                System.out.println("Thank you for using this system :)");
                break;
        }
        }while(choice!=3);
    }
}
