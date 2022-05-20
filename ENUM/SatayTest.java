package ENUM;
enum Satay {MUTTON, OSTRICH, CHICKEN, BEEF}
public class SatayTest{
    Satay satay;
    public SatayTest(Satay satay){
        this.satay = satay;
    }
    public void order(){
        switch(satay){
            case MUTTON: System.out.println("Mutton Satay - Fabulous.");break;
            case OSTRICH: System.out.println("Ostrich Satay - Fabulous.");break;
            default: System.out.println("Wrong Choice.");break;
        }
    }

public static void main(String[] args){
    SatayTest order1 = new SatayTest(Satay.OSTRICH);
    order1.order();
 
}}