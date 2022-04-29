//SOH ZEN REN A20EC0152
//THERESA LAU XIN YI A20EC0167
package SetA;
enum LevelList {    //Level
    LEVEL1(8.0, "HIGH HAPPINESS"), LEVEL2(6.0, "MEDIUM HAPPINESS"), LEVEL3(4.0, "LOW HAPPINESS"),
    LEVEL4(1.0, "NOT HAPPY");

    double index;
    String category;

    LevelList(double index, String category)
    {
        this.index=index;
        this.category=category;
    }

    String getCategoryLevel()
    {
        return category;
    }
    double getIndex()
    {
        return index;
    }
}