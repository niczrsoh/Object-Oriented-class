package Interface.FinalQ2;

public class Customer {
    private String CustName;
    private TennisShop[] itemList;
    private static int numOfItem;
    private double totalPay;
    public Customer(String custName) {
        CustName = custName;
        itemList = new TennisShop[4];
    }
    public String getName() {
        return CustName;
    }
    public int getNumOfItem() {
        return numOfItem;
    }
    public double getTotalPay() {
        return totalPay;
    }
    public void buy(TennisShop ts){ 
        itemList[numOfItem]=ts;
        numOfItem++;
        System.out.println("\n\nItem "+numOfItem);
        if(ts instanceof Ball){
            System.out.println("TENNIS BALL");
            ts.display();}
        if(ts instanceof Racket){
            System.out.println("TENNIS RACKET");
            ts.display();}
        totalPay+=ts.calcPrice();
    }
    public String toString() {
        return "WELCOME "+CustName;
    }
    public void print(){
System.out.printf("\n\nTOTAL: RM%.2f",totalPay);
    }
}
