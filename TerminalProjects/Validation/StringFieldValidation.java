package TerminalProjects.Validation;

import java.util.Scanner;

public class StringFieldValidation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = readNonNumericString(sc, "Enter your name: ");
        System.out.println("Accepted name: " + name);
        sc.close();
    }

    /**
     * Reads a String that must NOT be purely numeric.
     * - "123" -> rejected (number entered where text expected)
     * - "45.6" -> rejected
     * - "John" -> accepted
     * - "John123" -> accepted (contains letters)
     */
    public static String readNonNumericString(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = sc.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Input cannot be empty. Try again.");
                continue;
            }

            // Reject if the whole string looks like a number
            if (isNumeric(input)) {
                System.out.println(input + " is a number. Please enter text. Try again.");
                continue;
            }

            return input;
        }
    }

    /** Returns true if the entire string is a valid integer or decimal number. */
    private static boolean isNumeric(String s) {
        return s.matches("-?\\d+(\\.\\d+)?");
    }
}