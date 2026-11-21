package TerminalProjects;
import java.util.Scanner;
public class Student_Grade_Calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Number: ");   
        int n1 = sc.nextInt();

        while (n1 < 0 || n1 > 100) {
            System.out.print("Invalid input. Please enter a number between 0 and 100: ");
            n1 = sc.nextInt();
        }

        System.out.print("Enter 2nd Number: ");
        int n2 = sc.nextInt();
        while (n2 < 0 || n2 > 100) {
            System.out.print("Invalid input. Please enter a number between 0 and 100: ");
            n2 = sc.nextInt();
        }   

        System.out.print("Enter 3rd Number: ");
        int n3 = sc.nextInt();
        while (n3 < 0 || n3 > 100) {                    
            System.out.print("Invalid input. Please enter a number between 0 and 100: ");
            n3 = sc.nextInt();
        }

        int average = (n1 + n2 + n3) / 3;

        System.out.println("Average: " + average);

        sc.close();
    }
}
