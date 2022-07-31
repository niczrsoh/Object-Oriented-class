//Soh Zen Ren A20EC0152
//Using abstract & interface in JAVA
package Interface.Product;

public class TestProduct {
    public static void main(String[] args){
        Product[] inventory = new Product[4];
        inventory[0] = new Food("Meat",14.40,2000);
        inventory[0].display();
        inventory[1] = new Food("Banana",1.50,500);
        inventory[2] = new MotorVehicle("Proton","Car",56000);
        inventory[3] = new Gasoline("Unleaded","Diesel",2.50);
        for(int i=0; i<inventory.length; i++){
            System.out.println(inventory[i].display());
        }
    }
}
