package Polymorphism;

public class Customer {
   String name;
   double purchamnt;
   
   public Customer(String name, double purchamnt){
       this.name = name;
       this.purchamnt = purchamnt;
   }
    
   public double computeFinalPayment(){
       return purchamnt;
   }
   
   void display(){
       System.out.println("Name: " + name);
       System.out.println("Purchase Amount: " + purchamnt);
       System.out.println("Final Payment: " + computeFinalPayment());
   }
}




