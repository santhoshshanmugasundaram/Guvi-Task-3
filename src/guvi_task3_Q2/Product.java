package guvi_task3_Q2;

public class Product implements Taxable {
    private int pid;
    private double price; // Assuming this is the price per unit
    private int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    public double calcTax() {
        return price * quantity * salesTax; // salesTax is a percentage
    }
}
