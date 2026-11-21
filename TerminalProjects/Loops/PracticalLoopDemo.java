package TerminalProjects.Loops;

import java.util.Scanner;

public class PracticalLoopDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = readScore(sc);
        System.out.println("Final accepted score: " + score);
        sc.close();
    }

    static int readScore(Scanner sc) {
        while (true) { // infinite loop, exit via return/break
            System.out.print("Enter score (0-100, or 'q' to quit): ");
            String input = sc.nextLine().trim();

            if (input.equalsIgnoreCase("q")) {
                System.out.println("Quitting.");
                return -1; // RETURN — abort the method
            }

            if (input.isEmpty()) {
                System.out.println("  [X] Empty.");
                continue; // CONTINUE — retry
            }

            int value;
            try {
                value = Integer.parseInt(input);
            } catch (Exception e) {
                System.out.println("  [X] Not a number.");
                continue; // CONTINUE — retry
            }

            if (value < 0 || value > 100) {
                System.out.println("  [X] Out of range.");
                continue; // CONTINUE — retry
            }

            return value; // RETURN — hand back a good value
        }
    }
}
