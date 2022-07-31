package Product;

public class MotorVehicle extends Product implements Taxable{
    private String MotorType;
    MotorVehicle(String description,String MotorType,double price) {
        this.description = description;
        this.price = price;
        this.MotorType = MotorType;
    }
    String getMotorType() {
        return MotorType;
    }
    String display(){
        return "Motor name: "+getDescription()+"\nMotor Type: "+getMotorType()+
        String.format("\nMotor price: %.2f \nPrice after including tax: %.2f",getPrice(),calcTax())+"\n";
    }
    public double calcTax(){
        return (getPrice()*MotorVehicleTaxRate)+getPrice();
    }
}
