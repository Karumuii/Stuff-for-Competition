package EncapsulationWithUpdates;


public class PIS {
   private String prodName;
   private String prodCode;
   private double price = 25;
   private int quant = 5;
   
   public PIS(String prodName, String prodCode){
       this.prodName = prodName;
       this.prodCode = prodCode;
      
   }
   public String getName(){
       return prodName;
   }
   public String getCode(){
       return prodCode;
   }
   public double getPrice(){
       return price;
   }
   public int getQuan(){
       return quant;
   }
   public void updateprice(double newprice){
       if (newprice < price){ // or >= 0 then this.price 
           System.out.println("Invalid Updated Price");
       } else {
           this.price = newprice;
           System.out.println("After Updating the Price: " + price + "\n");
       }
   }
   public void updatequant(int newquan){
       if (newquan < quant){
           System.out.println("Invalid Updated Quantity");
       } else {
           this.quant = newquan;
           System.out.println("After Updating the Quantity: " + quant + "\n");
       }
   }
   public double calctotal (){
       return price * quant;
   }
   
   public void display(){
       if (quant >= 0 && price >= 0){ // if statement from Cyrus, mine don't have one
       System.out.println("Name:" + prodName);
       System.out.println("Code:" + prodCode);
       System.out.println("Price:" + getPrice());
       System.out.println("Quantity:" + getQuan());
       System.out.println("Total: " + calctotal());
       System.out.println();
       } else {
           System.out.println("Invalid must be non-negative");
       }
   }
}




