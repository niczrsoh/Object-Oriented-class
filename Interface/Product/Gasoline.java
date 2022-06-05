package Interface.Product;

public class Gasoline extends Product implements Taxable{
    private String type;
    Gasoline(String description,String type,double price) {
        this.description = description;
        this.price = price;
        this.type = type;
    }
    String getType(){
        return type;
    }
    String display(){
        return "Gasoline name: "+getDescription()+"\nGasoline Type: "+getType()+
        String.format("\nGasoline price: %.2f \nPrice after including tax: %.2f",getPrice(),calcTax())+"\n";
    }
    public double calcTax(){
        return (getPrice()*GasTaxRate)+getPrice();
    }
}
