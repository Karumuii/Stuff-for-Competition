package Inheritance2;

public class Main {
    public static void main(String[] args) {
         
         Teacher t = new Teacher("Rem", 1000, "OOP");
         ITStaff it = new ITStaff("Hi", 2000, "TBS");
         
         t.display();
         System.out.println();
         it.display();
         
         
    }
}
