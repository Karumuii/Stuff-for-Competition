package Inheritance;

public class Teacher extends Employee{
   Teacher(String name, int employeeID){
       super(name, employeeID);
   }

    @Override
    void Employeework() {
        System.out.println("Name: " + name + "(ID: " + employeeID + ") is Teaching the students");
    }
    
    
}




