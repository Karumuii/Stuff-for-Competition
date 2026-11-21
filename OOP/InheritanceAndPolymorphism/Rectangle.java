package InheritanceAndPolymorphism;

public class Rectangle extends Shape{
   
   private double width = 5;
    private double length = 5;
    
    void calcarea(){
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
    
}




