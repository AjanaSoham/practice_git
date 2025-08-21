class Account {
    double bal;
    double acno;

    Account(double b, double a){
        bal=b;
        acno=a;  
    }
    void deposit(double val){
        bal += val;
    }
    void withdarw(double val){
        bal -= val;
    }
    void diplayBal(){
        System.out.println("Account Balance: " + bal);
    }
}

class Savings extends Account{
    double interest;
    final double minbal = 1000;
    Savings(double a, double b, double i){
        super(b,a);
        interest=i;
    }
    void interest(double i){
        bal += bal*(i/100);
    }
}

class Current extends Account{
    double interest;
    final double overdraft = -2500;
    Current(double a, double b){
        super(b,a);
    }
}

public class Bank {
    
}
