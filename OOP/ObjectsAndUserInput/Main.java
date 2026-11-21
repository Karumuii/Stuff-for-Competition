package ObjectsAndUserInput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        Car c1 = new Car();
        c1.brand = "Ford";
        c1.model = "USahay";
        c1.plate = "LPH8871";
        c1.status = "Available";

        c1.display();

        System.out.print("Rent Brand: ");
        String rent = sn.nextLine();
        System.out.println();

        if (rent.equalsIgnoreCase(c1.brand)) {
            if (c1.status.equalsIgnoreCase("Available")) {
                c1.status = "Rented";
                c1.display();
                System.out.println(rent + " is Rented and can no longer rented");
            } else if (c1.status.equalsIgnoreCase("Rented")) {
                c1.status = "Already Rented";
                c1.display();
            }
        } else {
            System.out.println("Not in the List of Brands");
        }
    }
}
