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

public class Bank {
    public static void main(String[] args) {

        Savings acc1 = new Savings("SBI-SAV", 5000.00, 3.5);
        Current acc2 = new Current("SBI-CURR", 10000.00);
        while (true) {

            System.out.println("MENU: \n 1. Show balance\n 2. Deposit\n 3. Withdraw\n 4. Exit");

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    acc1.displayBal();
                    acc2.displayBal();
                    break;
                case 2:
                    System.out.println("Enter amount: ");
                    double a = sc.nextDouble();
                    acc1.deposit(a);
                    acc2.deposit(a);
                    acc1.displayBal();
                    acc2.displayBal();
                    break;
                case 3:
                    System.out.println("Enter amount: ");
                    double b = sc.nextDouble();
                    acc1.withdarw(b);
                    ;
                    acc2.withdarw(b);
                    acc1.displayBal();
                    acc2.displayBal();
                    break;
                case 4:
                    System.out.println("Accounts closed");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Input");
            }

        }
    }
}
