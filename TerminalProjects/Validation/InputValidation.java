package TerminalProjects.Validation;

import java.util.Scanner;

public class InputValidation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = readIntegerInRange(sc, "Enter a score (0-100): ", 0, 100);
        System.out.println("Accepted score: " + score);
        sc.close();
    }

    /**
     * Reads an integer in [min, max].
     * - Rejects non-numeric text (e.g. "abc") -> loops
     * - Rejects numeric text that is NOT a valid integer (e.g. "85.5") -> loops
     * - Rejects out-of-range numbers -> loops
     */
    public static int readIntegerInRange(Scanner sc, String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            String input = sc.nextLine().trim(); // read as String first

            // Case 1: input is empty
            if (input.isEmpty()) {
                System.out.println("  [X] Empty input. Try again.");
                continue;
            }

            // Case 2: input is text (not a number) -> "abc"
            // This is the "String entered where Integer expected" case
            int value;
            try {
                value = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("  [X] \"" + input + "\" is not a valid integer. Try again.");
                continue;
            }

            // Case 3: input was a number but out of range
            if (value < min || value > max) {
                System.out.println("  [X] " + value + " is out of range [" + min + ", " + max + "]. Try again.");
                continue;
            }

            // All good
            return value;
        }
    }
}