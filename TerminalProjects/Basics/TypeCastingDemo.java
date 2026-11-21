package TerminalProjects.Basics;

public class TypeCastingDemo {
    public static void main(String[] args) {
        System.out.println("=== Type Casting ===");

        // 1. Widening (Automatic) - Small to Large
        int myInt = 100;
        double myDouble = myInt; // int to double (automatic)
        System.out.println("Int to Double: " + myDouble);

        // 2. Narrowing (Manual) - Large to Small
        double pi = 3.14159;
        int approxPi = (int) pi; // double to int (requires explicit cast)
        System.out.println("Double to Int (truncates): " + approxPi); // 3

        // 3. Char to Int (ASCII values)
        char letter = 'A';
        int asciiValue = letter;
        System.out.println("Char 'A' to ASCII Int: " + asciiValue); // 65

        // 4. Int to Char
        int code = 66;
        char letterB = (char) code;
        System.out.println("ASCII 66 to Char: " + letterB); // B

        // 5. String to Int (Very common in competitions!)
        String numStr = "123";
        int parsedInt = Integer.parseInt(numStr);
        System.out.println("String '123' to Int: " + (parsedInt + 1)); // 124
    }
}
