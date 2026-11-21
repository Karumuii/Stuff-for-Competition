package Inheritance2;

public class ITStaff extends Employee{
   String specialization;
    
    ITStaff(String name, int salary, String specialization){
        super(name, salary);
        this.specialization = specialization;
    }
    void display(){
        super.display();
        System.out.println("Specialization: " + specialization);
    }
    
    
}




