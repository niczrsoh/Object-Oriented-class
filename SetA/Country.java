//SOH ZEN REN A20EC0152
//THERESA LAU XIN YI A20EC0167
package SetA;
class Country {
    private String name, factor, category;
    private double index;
    static int total;
    Country(String n, String f, double i, String c)
    {
        name=n;
        factor=f;
        index=i;
        category=c;
        total++;
    }
    String getName()
    {
        return name;
    }
    String getFactor()
    {
        return factor;
    }
    String getCategory()
    {
        return category;
    }
    double getIndex()
    {
        return index;
    }
    public String toString(){
        return String.format("%-20s%-20s%-8s%-30s",getFactor(),getName(),getIndex(),getCategory());
    }
}