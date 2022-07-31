package Vector;

import java.util.Vector;

public class Example1 {
    public static void main(String[] args){
    Vector v = new Vector();
    v.addElement("Jamil");
    v.addElement(new Double(15.0));
    v.addElement(new Double(21.5));
    v.addElement(new Integer(100));
    double sum=0.0;
    //use Object instead of Vector because Vector is subclass of Object!
    for(Object e : v){
        if(e instanceof Double){
            sum+=((Double)e).doubleValue();
        }
    }
    System.out.println("sum: "+sum);
}
}
