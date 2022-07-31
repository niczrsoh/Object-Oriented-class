package Interface.ProblemSolving1;

import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Savings saving = new Savings("Ahmad");
        int choice;
        do{
        System.out.println("********* BANK ACCOUNT MENU *********");
        System.out.print("1.  Savings Account Deposit\n2.  Savings Account Withdrawal\n3.  Display Report\n4.  Exit\n\nPlease enter your choice (1-4) :");
        choice = sc.nextInt();
        double amount;
        switch(choice) {
            case 1:
            System.out.print("Enter amount to deposit: ");
            amount = sc.nextDouble();
            saving.deposit(amount);
            System.out.println("Please insert your cash.\nDeposit accepted.");
            System.out.println("Your current balance is RM"+saving.balance);
            break;
            case 2:
            System.out.print("Enter amount to withdraw: ");
            amount = sc.nextDouble();
            saving.withdraw(amount);
            System.out.println("Please take your cash.");
            System.out.println("Your current balance is RM"+saving.balance);
            break;
            case 3:
            saving.displayReport();
            break;
            case 4: break;
        }
        System.out.println();
        }while(choice!=4);
    }
}
