package Encapsulation;

public class Main {

    public static void main(String[] args) {

        Square s = new Square();
        s.setside(5);

        System.out.println("Side: " + s.getside());
        System.out.println("Area: " + s.getArea());
    }
}
