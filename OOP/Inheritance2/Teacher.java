package Inheritance2;

public class Teacher extends Employee{
    String subject;
    
    Teacher(String name, int salary, String subject){
        super(name, salary);
        this.subject = subject;
    }
    void display(){
        super.display();
        System.out.println("Subject: " + subject);
    }
    
    
}




