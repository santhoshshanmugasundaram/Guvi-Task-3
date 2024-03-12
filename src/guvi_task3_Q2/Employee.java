package guvi_task3_Q2;

public class Employee implements Taxable {
    private int empID;
    private String name;
    private double salary; // Assuming this is the yearly salary

    public Employee(int empID, String name, double salary) {
        this.empID = empID;
        this.name = name;
        this.salary = salary;  
    }
         
  
    public double calcTax(){
        return salary * (Taxable.incomeTax / 100); // Access incomeTax through the interface
    }
}
