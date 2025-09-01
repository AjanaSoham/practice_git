import java.util.Scanner;
import java.util.ArrayList;

class Account {
    double bal;
    String acno;

    Account(double b, String a) {
        bal = b;
        acno = a;
    }

    void deposit(double val) {
        bal += val;
    }

    void withdarw(double val) {
        bal -= val;
    }

    void displayBal() {
        System.out.println("Account Balance: " + bal);
    }
}

class Savings extends Account {
    double interest;
    final double minbal = 1000;

    Savings(String a, double b, double i) {
        super(b, a);
        interest = i;
    }

    void interest(double i) {
        bal += bal * (i / 100);
    }
}

class Current extends Account {
    double interest;
    final double overdraft = -2500;

    Current(String a, double b) {
        super(b, a);
    }
}

public class FullBank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("MENU \n 1. Create Savings Account \n 2. Create Current Account \n 3. Exit");

        System.out.print("Enter Choice: ");
        int ch1 = sc.nextInt();

        switch (ch1){
            case 1:
                System.out.println("Enter Account number: ");
                String acno = sc.next();
                System.out.println("Enter opening balance: ");
                Double val = sc.nextDouble();
                System.out.println("Enter Interest amount: ");
                Double interest = sc.nextDouble();
                Savings.add(new Savings(acno, val, interest));
                
        }
        System.out.println("MENU: \n 1. Show balance\n 2. Deposit\n 3. Withdraw\n 4. Exit");

        
        //restart
    }

    

}
