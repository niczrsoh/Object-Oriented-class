package Interface.ProblemSolving1;

public class Savings extends Account implements Profit{
    private String accName;

    public Savings(String accName) {
        super("001",2000.00);
        this.accName = accName;
    }
    public double calcHibah() {
        return balance*HIBAH_RATE;
    }

    @Override
    public void displayReport() {
        System.out.println("Monthly Hibah Earned: RM"+calcHibah());
        System.out.println("Ending Balance: "+(balance+calcHibah()));
    }
}
