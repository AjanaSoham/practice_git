import java.util.Scanner;

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
        
    }

    

}
