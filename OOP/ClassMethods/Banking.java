package ClassMethods;

public class Banking {

    String accname;
    int id;
    double money, amountwiDraw, amountdepo;
    double after;

    void withdraw() {
        double f = money - amountwiDraw;
        System.out.println("Amount to Withdraw: " + amountwiDraw);
        System.out.println("Balance after the Withdrawal: " + f);
        after = f;
    }

    void deposit() {
        double n = after + amountdepo;
        System.out.println("Amount to Deposit: " + amountdepo);
        System.out.println("Total Balance after Deposit: " + n);
    }

    void disp() {
        System.out.println("Account Name: " + accname);
        System.out.println("Account ID: " + id);
        System.out.println("Account Balance: " + money);
    
        System.out.println();
    }
}
