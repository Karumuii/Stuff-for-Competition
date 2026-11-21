package TerminalProjects.Validation;

import java.util.Scanner;

public class BeginnerValidation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;
        boolean valid = false;

        // Keep asking until we get a valid integer between 0 and 100
        while (valid == false) {
            System.out.print("Enter a score (0-100): ");
            String input = sc.nextLine(); // read as text first

            // Step 1: Check if the text is actually a number
            boolean isNumber = true;
            try {
                Integer.parseInt(input);
            } catch (Exception e) {
                isNumber = false; // "abc" lands here -> not a number
            }

            // Step 2: If it's not a number, reject and loop again
            if (isNumber == false) {
                System.out.println("  [X] That's not a number. Try again.");
            } else {
                // Step 3: It IS a number -> convert and check range
                score = Integer.parseInt(input);

                if (score < 0 || score > 100) {
                    System.out.println("  [X] Number must be between 0 and 100. Try again.");
                } else {
                    valid = true; // good input -> exit loop
                }
            }
        }

        System.out.println("Accepted score: " + score);
        sc.close();
    }
}