package Constructors;

public class SalaryCalculator {

    String name;
    int id;
    double bsalary;
    double overtimehrs;
    double salaryperhr;

    double resultotp;
    double resultgross;
    double resultnet;
    double deduct;

    public SalaryCalculator(String name, int id, double bsalary, double overtimehrs, double salaryperhr) {
        this.name = name;
        this.id = id;
        this.bsalary = bsalary;
        this.overtimehrs = overtimehrs;
        this.salaryperhr = salaryperhr;

    }

    public void overtimepay() {
        double otp = salaryperhr * overtimehrs;
        resultotp = otp;
    }

    public void grossSalary() {
        double gross = bsalary + resultotp;
        resultgross = gross;
    }

    public void netSalary() {
        double deductionRate = 0.10; // 10%
        double d = resultgross * deductionRate;
        deduct = d;
        
        double net = resultgross - (resultgross * deductionRate);
        resultnet = net;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Basic Salary: " + bsalary);
        System.out.println("Overtime Hours: " + overtimehrs);
        System.out.println("Salary per Hour: " + salaryperhr);
        System.out.println("Overtime Pay: " + resultotp);
        System.out.println("Gross Salary: " + resultgross);
        System.out.println("Net Salary: " + resultnet);
        System.out.println("Deduction: " + deduct);

    }
}