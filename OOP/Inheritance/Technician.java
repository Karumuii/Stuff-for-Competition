package Inheritance;

public class Technician extends Employee {
   Technician(String name, int employeeID){
       super(name, employeeID);
   }

    @Override
    void Employeework() {
        System.out.println("Name: " + name + "(ID: " + employeeID + ") is mainting the computers");
    }
    
    
}




