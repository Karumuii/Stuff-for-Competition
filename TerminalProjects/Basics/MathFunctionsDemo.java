package TerminalProjects.Basics;

public class MathFunctionsDemo {
    public static void main(String[] args) {
        System.out.println("=== Math Functions ===");

        // 1. Max and Min
        System.out.println("Max of 10 and 20: " + Math.max(10, 20));
        System.out.println("Min of 10 and 20: " + Math.min(10, 20));

        // 2. Absolute Value (turns negative to positive)
        System.out.println("Absolute of -15: " + Math.abs(-15));

        // 3. Powers and Roots
        System.out.println("2 to the power of 3: " + Math.pow(2, 3)); // 8.0
        System.out.println("Square root of 81: " + Math.sqrt(81)); // 9.0

        // 4. Rounding
        System.out.println("Round 4.6: " + Math.round(4.6)); // 5
        System.out.println("Ceil of 4.1: " + Math.ceil(4.1)); // 5.0 (always rounds up)
        System.out.println("Floor of 4.9: " + Math.floor(4.9)); // 4.0 (always rounds down)

        // 5. Random Numbers (0.0 to 0.999...)
        int randomNum = (int) (Math.random() * 100) + 1; // Generates 1 to 100
        System.out.println("Random number (1-100): " + randomNum);
    }
}
