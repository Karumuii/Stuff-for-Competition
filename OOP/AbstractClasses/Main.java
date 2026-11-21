package AbstractClasses;
import java.util.*;

public class Main {
    public static void main(String[] args) {
         
         Scanner sn = new Scanner(System.in);
         System.out.print("Enter the type (FACULTY/STUDENT): ");
         String type = sn.nextLine();
         
         System.out.print("Enter your name: ");
         String name = sn.nextLine();
         
         LibraryUser user = null;
         if(type.equalsIgnoreCase("FACULTY")){
             user = new Faculty(name);
         } else if (type.equalsIgnoreCase("STUDENT")){
             user = new Student(name);
         } else {
             System.out.println("Invalid type. Program ending.");
             return;
         }
         
         int numbook;
         do {
             System.out.print("How many books to borrow: ");
             numbook = Integer.parseInt(sn.nextLine());
             user.failed = false;          // reset before each attempt
             user.borrowbooks(numbook, sn);
         } while (user.failed);
         
         user.displayborrowedbooks();
    }
    }
