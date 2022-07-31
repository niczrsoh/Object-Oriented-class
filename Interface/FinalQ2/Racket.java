package Interface.FinalQ2;

public class Racket extends TennisShop{
    private int racketType;

    public Racket() {
    }

    public Racket(String brand, double price, int quantity, int racketType) {
        
        super(brand, price, quantity);
        this.racketType = racketType;
    }

    public void display() {
        String typeName="";
        switch(racketType) {
            case  1:  
            typeName = "Junior Tennis Racket";
                setPrice(80.00); break;
            case 2: 
            typeName = "Beginners Tennis Racket";
            setPrice(110.00); break;
            case  3:  
            typeName = "Advanced Tennis Racket";
            setPrice(235.00); break;
        case 4: 
        typeName ="All Tennis Racket";
        setPrice(185.00); break;
        }
        System.out.printf("%-10s: %s","Brand",getBrand());
        System.out.printf("\n%-10s: %s","Type",typeName);
        System.out.printf("\n%-10s: RM%.2f","Price",getPrice());
        System.out.printf("\nNo Discount");
        System.out.printf("\n%-10s: %s","Quantity",getQuantity());
        System.out.printf("\n%-10s: RM%.2f","Subtotal",calcPrice());
    }

    public double calcPrice() {
        return getPrice()*getQuantity();
    }
    
}
