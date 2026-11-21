package AbstractClasses2;
import java.util.*;
public class Main {
     private static int readIntInRange(Scanner sn, String statement, int min, int max) {
        while (true) {
            System.out.print(statement);
            String input = sn.nextLine().trim();
            try {
                int value = Integer.parseInt(input);
                if (value >= min && value <= max) {
                    return value;
                }
                System.out.println("Please enter a number between " + min + " and " + max + ".");
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
    public static void main(String[] args) {
         
         Scanner sn = new Scanner (System.in);
         
         System.out.println("======= Math Learning ========");
         System.out.print("Enter your name: ");
         String name = sn.nextLine().trim();
         
         System.out.println("\nChoose an Activity: ");
         System.out.println("1. Addition");
         System.out.println("2. Subtraction");
         System.out.print("Enter choice (1-2): ");
         int choice = readIntInRange(sn, "Enter choice (1-2): ", 1, 2);

         
         MathActivity act = null;
         if (choice == 1){
             act = new AdditionActivity(name);
         } else if (choice == 2){
             act = new SubtractionActivity(name);
         } else {
             System.out.println("Invalid Number.");
         }
         
         int n = readIntInRange(sn, "How many questions do you want to answer (1-5): ", 1, 5);
   
         
         act.setNumOfQuestions(n);
         
         System.out.println();
         act.start(sn);
         act.display();
         
         
         
         
         
    }
}
