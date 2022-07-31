package Product;

public class Food extends Product{
    private int calories;
    Food(String description,double price, int calories) {
        this.description = description;
        this.price = price;
        this.calories = calories;
    }
    int getCalories() {
        return calories;
    }
    public String display(){
        return "Food name: "+getDescription()+String.format("\nFood price: %.2f",getPrice())+"\nFood calories: "+getCalories()+"\n";
    }
}
