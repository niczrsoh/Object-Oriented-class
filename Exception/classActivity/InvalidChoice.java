package Exception.classActivity;

public class InvalidChoice extends Exception {
    InvalidChoice(){}
    InvalidChoice(String msg){
        System.out.println(msg);
    }
}
