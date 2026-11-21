package Inheritance2;

public class Employee {
   String name;
   int salary;
   
   Employee(String name, int salary){
       this.name = name;
       this.salary = salary;
   }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
    
}




