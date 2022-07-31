package Interface.FinalQ2;

public abstract class TennisShop {
    private String brand;
    private double price;
    public void setPrice(double price) {
        this.price = price;
    }
    private int quantity;
    public String getBrand() {
        return brand;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    abstract public void display();
    abstract public double calcPrice();
    public TennisShop(String brand, double price, int quantity) {
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
    }
    public TennisShop() {}
}
