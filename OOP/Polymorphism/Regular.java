package Polymorphism;

public class Regular extends Customer{
   private double discountRate;
    public Regular(String name, double purchamnt, double discountRate) {
        super(name, purchamnt);
        this.discountRate = discountRate;
    }
   
    public double computeDiscount(){
        return purchamnt * discountRate;
    }
    @Override
    public double computeFinalPayment(){
        return purchamnt - computeDiscount();
    }
    
    public void Display(){
        super.display();
        System.out.println("Discount: " + computeDiscount());
    }
    
    
}




