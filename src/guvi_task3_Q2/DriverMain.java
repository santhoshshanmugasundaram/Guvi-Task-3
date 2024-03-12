package guvi_task3_Q2;

public class DriverMain {
    public static void main(String[] args) {
        // Mock inputs (these would be gathered via something like Scanner in a real application)
        int empID = 1;
        String empName = "santhosh";
        double empSalary = 50000.0; // Yearly salary

        int pid = 102;
        double price = 299.99;
        int quantity = 3;

        // Create Employee and Product instances
        Employee employee = new Employee(empID, empName, empSalary);
        Product product = new Product(pid, price, quantity);

        // Calculate and display the taxes
        double employeeTax = employee.calcTax();
        double productTax = product.calcTax();

        System.out.println("Employee Income Tax: $" + employeeTax);
        System.out.println("Product Sales Tax: $" + productTax);
    }
}

//output;
//Employee Income Tax: $5250.0
//Product Sales Tax: $62.99790000000001
