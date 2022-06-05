package AbstractClass;

public class CardTester {
    public static void main(String[] args){
    Card[] c= new Card[3];
 c[0]=new KadRaya("James");
    c[1] = new Birthday("James",15);
    c[2]= new Wedding("James");
    for(Card card:c){
        card.greeting();
    }
  
    }
}
