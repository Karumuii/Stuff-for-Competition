package Constructors;

public class Main {
    public static void main(String[] args) {
         
       SalaryCalculator s1 = new SalaryCalculator("Rembrunt", 91811, 500, 4, 50);
        
       s1.overtimepay();
       s1.grossSalary();
       s1.netSalary();
       s1.display();
       
         
    }
}