package Polymorphism;

public class Premium extends Customer{
    public static final int VALID_CODE = 123;

    private double DeliveryFee;
    private int code;

    public Premium(String name, double purchamnt, double DeliveryFee, int code) {
        super(name, purchamnt);
        this.DeliveryFee = DeliveryFee;
        this.code = code;
    }

    public static boolean isValidCode(int code) {
        return code == VALID_CODE;
    }

    @Override
    public double computeFinalPayment(){
        return (purchamnt * 0.85) + DeliveryFee;
    }

    public void Display(){
        super.display();
        System.out.println("Delivery Fee: " + DeliveryFee);
        System.out.println("Code: " + code);
    }
}