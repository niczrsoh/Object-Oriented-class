package Product;

interface Taxable{
    public static final double GasTaxRate = 0.75;
    public static final double MotorVehicleTaxRate = 0.5;
    public abstract double calcTax();
}
