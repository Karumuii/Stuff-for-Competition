package InheritanceAndOverriding;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         
         //DeliveryOrder water = new DeliveryOrder("Josh", 2, 30, 1, 5);
         
        // water.DisplayAll();
         
         Scanner sc = new Scanner(System.in);
         
         System.out.print("Enter the Customer Name: ");   
         String name = sc.nextLine();
         
         System.out.print("Enter the Number of Gallons: "); 
         int numberofGallon = sc.nextInt();
         sc.nextLine();
         
         System.out.print("Delivery Distance: ");
         double DeliveryDistance = sc.nextDouble();
         sc.nextLine();
         
         DeliveryOrder d  = new DeliveryOrder(name, numberofGallon, 30, DeliveryDistance, 5);
         
         System.out.println();
         d.DisplayAll();
         
         // Price and Delivery Fee = Not Scanner
         
         
    }
}
