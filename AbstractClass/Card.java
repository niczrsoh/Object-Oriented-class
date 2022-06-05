package AbstractClass;

public abstract class Card {
    protected String recipient;
    public abstract void greeting();
}

class KadRaya extends Card {
    public KadRaya(String r){
        recipient = r;
    }
    public void greeting(){
        System.out.println("Dear"+recipient+",\n");
        System.out.println("Selemat Hari Raya!\n\n");
    }
}

class Birthday extends Card {
    int age;
    public Birthday(String r, int years){
        recipient = r;
        age = years;
    }
    public void greeting(){
        System.out.println("Dear"+recipient+",\n");
        System.out.println("Happy"+age+"th Birthday\n");
    }
}

class Wedding extends Card {
    public Wedding(String r){
        recipient = r;
    }
    public void greeting(){
        System.out.println("Best wishes on "+recipient+"'s wedding\n");
    }
}
