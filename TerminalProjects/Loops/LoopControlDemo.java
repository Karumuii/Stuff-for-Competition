package TerminalProjects.Loops;

public class LoopControlDemo {

    public static void main(String[] args) {
        System.out.println("=== 1. BREAK ===");
        demoBreak();

        System.out.println("\n=== 2. CONTINUE ===");
        demoContinue();

        System.out.println("\n=== 3. RETURN (exits method) ===");
        demoReturn();

        System.out.println("\n=== 4. BREAK with LABEL ===");
        demoLabeledBreak();

        System.out.println("\n=== 5. CONTINUE with LABEL ===");
        demoLabeledContinue();

        System.out.println("\n=== 6. do-while with break ===");
        demoDoWhile();

        System.out.println("\n=== 7. Return value from a loop ===");
        System.out.println("Found index: " + findIndex(new int[] { 4, 8, 15, 16, 23, 42 }, 16));
    }

    // ---------- 1. BREAK ----------
    static void demoBreak() {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Hit 5 — stopping the loop with break.");
                break; // exit loop entirely
            }
            System.out.println("i = " + i);
        }
    }

    // ---------- 2. CONTINUE ----------
    static void demoContinue() {
        for (int i = 1; i <= 6; i++) {
            if (i % 2 == 0) {
                continue; // skip the rest of THIS iteration
            }
            System.out.println("Odd number: " + i);
        }
    }

    // ---------- 3. RETURN ----------
    static void demoReturn() {
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                System.out.println("Hit 4 — leaving the whole method with return.");
                return; // exits the METHOD, not just the loop
            }
            System.out.println("i = " + i);
        }
        System.out.println("This line never runs."); // unreachable here
    }

    // ---------- 4. LABELED BREAK ----------
    static void demoLabeledBreak() {
        outer: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i * j == 6) {
                    System.out.println("Found i*j=6 at (" + i + "," + j + ") — breaking OUTER loop.");
                    break outer; // exits BOTH loops
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }

    // ---------- 5. LABELED CONTINUE ----------
    static void demoLabeledContinue() {
        outer: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    System.out.println("j == 2 — continue OUTER (skip rest of row " + i + ")");
                    continue outer; // skip to next i
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }

    // ---------- 6. do-while + break ----------
    static void demoDoWhile() {
        int n = 0;
        do {
            n++;
            if (n == 3) {
                System.out.println("n reached 3 — break out of do-while.");
                break;
            }
            System.out.println("n = " + n);
        } while (n < 10);
    }

    // ---------- 7. Return a value from inside a loop ----------
    static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // exits method and hands back the index
            }
        }
        return -1; // not found
    }
}