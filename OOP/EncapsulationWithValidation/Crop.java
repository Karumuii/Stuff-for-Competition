package EncapsulationWithValidation;

public class Crop {

    private String cropName;
    private double farmArea;
    private double quantityPlanted;
    private String fertilizerUsed;
    private double expectedYield;
    private double pricePerKg;

    public Crop(String cropName, double farmArea, double quantityPlanted, String fertilizerUsed, double expectedYield, double pricePerKg) {

        this.cropName = cropName;
        setFarmArea(farmArea);
        setQuantityPlanted(quantityPlanted);
        this.fertilizerUsed = fertilizerUsed;
        setExpectedYield(expectedYield);
        setPricePerKg(pricePerKg);

    }

    // Getter 
    public String getCropName() {
        return cropName;
    }

    public double getFarmArea() {
        return farmArea;
    }

    public double getQuantityPlanted() {
        return quantityPlanted;
    }

    public String getFertilizerUsed() {
        return fertilizerUsed;
    }

    public double getExpectedYield() {
        return expectedYield;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }
    // ----------------------------------------

    public void setCropName(String cropName) {
        this.cropName = cropName;
    }

    public void setFarmArea(double farmArea) {
        if (farmArea < 0) {
            System.out.println("Invalid input: Farm area cannot be negative. Value ignored.");
        } else {
            this.farmArea = farmArea;
        }
    }

    public void setQuantityPlanted(double quantityPlanted) {
        if (quantityPlanted < 0) {
            System.out.println("Invalid input: Quantity planted cannot be negative. Value ignored.");
        } else {
            this.quantityPlanted = quantityPlanted;
        }
    }

    public void setFertilizerUsed(String fertilizerUsed) {
        this.fertilizerUsed = fertilizerUsed;
    }

    public void setExpectedYield(double expectedYield) {
        if (expectedYield < 0) {
            System.out.println("Invalid input: Expected yield cannot be negative. Value ignored.");
        } else {
            this.expectedYield = expectedYield;
        }
    }

    public void setPricePerKg(double pricePerKg) {
        if (pricePerKg < 0) {
            System.out.println("Invalid input: Price cannot be negative. Value ignored.");
        } else {
            this.pricePerKg = pricePerKg;
        }
    }

    public double calcHarvest() {
        return farmArea * expectedYield;
    }

    public double calcIncome() {
        return calcHarvest() * pricePerKg;
    }

    public void displayInfo() {
        System.out.println("Crop Name         : " + cropName);
        System.out.println("Farm Area (ha)    : " + farmArea);
        System.out.println("Quantity Planted  : " + quantityPlanted);
        System.out.println("Fertilizer Used   : " + fertilizerUsed);
        System.out.println("Expected Yield    : " + expectedYield + " kg/ha");
        System.out.printf("Expected Harvest  : %.2f kg%n", calcHarvest());
        System.out.printf("Estimated Income  : P%.2f%n", calcIncome());
    }
}
