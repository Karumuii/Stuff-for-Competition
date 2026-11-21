package Polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String type;
        while (true) {
            System.out.print("Are you a Regular or Premium customer? ");
            type = sc.nextLine().trim();
            if (type.equalsIgnoreCase("Regular") || type.equalsIgnoreCase("Premium")) {
                break;
            }
            System.out.println("Invalid choice. Please type Regular or Premium.");
        }

        if (type.equalsIgnoreCase("Regular")) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter purchase amount: ");
            double amount = sc.nextDouble();

            System.out.print("Enter discount rate (e.g. 0.5): ");
            double rate = sc.nextDouble();

            System.out.println();
            System.out.println("Regular:");
            Regular r = new Regular(name, amount, rate);
            r.Display();

        } else {
            int code;
            while (true) {
                System.out.print("Enter code: ");
                if (sc.hasNextInt()) {
                    code = sc.nextInt();
                    if (Premium.isValidCode(code)) {
                        break;
                    }
                } else {
                    sc.next(); // discard non-number input
                }
                System.out.println("Invalid code. Please try again.");
            }
            sc.nextLine(); // consume leftover newline before reading the name

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter purchase amount: ");
            double amount = sc.nextDouble();

            System.out.print("Enter delivery fee: ");
            double fee = sc.nextDouble();

            System.out.println();
            System.out.println("Premium:");
            Premium p = new Premium(name, amount, fee, code);
            p.Display();
        }

        
    }
}
