package Interface.FinalQ2;

public class Ball extends TennisShop implements DiscConsiderable{
    private int numOfCan;

    public Ball() {
    }

    public Ball(String brand, double price, int quantity, int numOfCan) {
        super(brand, price, quantity);
        this.numOfCan = numOfCan;
    }

    public void display() {
        System.out.printf("%-10s: %s","Brand",getBrand());
        System.out.printf("\n%-10s: RM%.2f for %d can case","Price",getPrice(),numOfCan);
        System.out.printf("\n%-10s: %.1f %c","Discount",RATE*100,'%');
        System.out.printf("\n%-10s: %s","Quantity",getQuantity());
        System.out.printf("\n%-10s: RM%.2f","Subtotal",calcPrice());
    }

    public double calcPrice() {
        return calcDisc()*getQuantity();
    }

    public double calcDisc() {
        return getPrice()*(1-RATE);
    }

    
    
}
