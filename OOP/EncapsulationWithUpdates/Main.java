package EncapsulationWithUpdates;

public class Main {

    public static void main(String[] args) {
        PIS p = new PIS("Remn", "78");

//        p.display();
//
//       p.updateprice(-1);
//       p.updatequant(-1);
//       
//       p.calctotal();
//       
//       
//       p.display();

        double newprice = -1;
        int newquan = -1;

        p.updateprice(newprice);
        p.updatequant(newquan);

        if (newprice >= 0 && newquan >= 0) {
            p.display();
        }
    

    }
}
