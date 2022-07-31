public enum Size{
    S("Small",10.00),R("Regular",15.00),L("Large",25.00);
    private String size;
    private double price;
    private Size(String size, double price){
        this.size= size;
        this.price = price;
    }
    public String getSize(){
        return size;
    }
    public double getPrice(){
        return price;
    }
}