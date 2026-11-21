package ClassMethods;

public class OOP1 {
    public static void main(String[] args) {
         
         Banking b = new Banking();
         
         b.accname = "Rem";
         b.id = 1001;
         b.money = 30000.00;
         b.amountwiDraw = 10000;
         b.amountdepo = 50000;
         
         b.disp();
         
         b.withdraw();
         b.deposit();
         
         
         
         
    }
}
