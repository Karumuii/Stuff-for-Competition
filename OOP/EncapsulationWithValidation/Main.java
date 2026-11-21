package EncapsulationWithValidation;

public class Main {

    public static void main(String[] args) {

        Crop rice = new Crop("Rice", 2.5, 500, "Basta", 4000, 67.0);

        System.out.println("Farm Record");
        rice.displayInfo();

        System.out.println("\nAttempting to set an invalid farm area...");
        rice.setFarmArea(-10);
//
//      
//        System.out.println("Attempting to set an invalid expected yield...");
//        rice.setExpectedYield(-500);
        System.out.println("\nUpdating fertilizer used (valid update)...");
        rice.setFertilizerUsed("Organic Compost");

        System.out.println("\nFarm Record After Updates");
        rice.displayInfo();

    }
}
