package InheritanceAndPolymorphism;

public class Circle extends Shape{

    private double radius = 5;
    @Override
    void calcarea() {
        double area = Math.PI * (radius * radius);
        System.out.println("Area of Circle: " + area);
    }
   
}




