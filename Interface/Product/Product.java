package Interface.Product;

public abstract class Product {
    protected String description;
    protected double price;
    abstract String display();
    double getPrice(){return price;}
    String getDescription(){return description;}
}
