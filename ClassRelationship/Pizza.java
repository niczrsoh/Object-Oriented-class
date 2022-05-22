package ClassRelationship;
 
public class Pizza{
    private String description;
    private Size saiz;
    Pizza(String description, Size saiz){
        this.description= description;
        this.saiz = saiz;
    }
    String getDescription(){
        return description;
    }
    Size getPizzaSize(){
        return saiz;
    }
}