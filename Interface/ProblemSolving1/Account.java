package Interface.ProblemSolving1;

public abstract class Account {
    protected String accNo;
    protected double balance;
    public Account() {
    }
    public Account(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }  
    public abstract void displayReport();
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        try{
        if(amount<0) throw new Exception("The amount is less than 0. Please enter the amount again");
        if(balance-amount < 0) throw new Exception("The amount requested has exceeded the balance");
        balance -= amount;}
        catch(Exception e){
            e.getMessage();
            return;
        }
    }
    
}
