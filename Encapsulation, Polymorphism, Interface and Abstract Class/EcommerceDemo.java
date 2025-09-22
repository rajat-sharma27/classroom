// EcommerceDemo.java
import java.util.*;

abstract class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId; this.name = name; this.price = price;
    }

    public String getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public abstract double calculateDiscount();

    public void printDetails() {
        System.out.printf("%s (%s) - %.2f%n", name, productId, price);
    }
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    public Electronics(String id, String name, double price) { super(id, name, price); }
    @Override public double calculateDiscount() { return getPrice() * 0.05; }
    @Override public double calculateTax() { return getPrice() * 0.18; }
    @Override public String getTaxDetails() { return "Electronics tax: 18%"; }
}

class Clothing extends Product implements Taxable {
    public Clothing(String id, String name, double price) { super(id, name, price); }
    @Override public double calculateDiscount() { return Math.min(50, getPrice() * 0.10); }
    @Override public double calculateTax() { return getPrice() * 0.05; }
    @Override public String getTaxDetails() { return "Clothing tax: 5%"; }
}

class Groceries extends Product {
    public Groceries(String id, String name, double price) { super(id, name, price); }
    @Override public double calculateDiscount() { return 0; }
}

public class EcommerceDemo {
    public static void printFinalPrice(Product p) {
        double price = p.getPrice();
        double discount = p.calculateDiscount();
        double tax = (p instanceof Taxable) ? ((Taxable)p).calculateTax() : 0.0;
        double finalPrice = price + tax - discount;
        p.printDetails();
        System.out.printf("Tax: %.2f | Discount: %.2f | Final Price: %.2f%n%n", tax, discount, finalPrice);
    }

    public static void main(String[] args) {
        List<Product> cart = List.of(
                new Electronics("E100", "Smartphone", 20000),
                new Clothing("C200", "T-Shirt", 799),
                new Groceries("G300", "Rice 5kg", 450)
        );
        for (Product p : cart) printFinalPrice(p);
    }
}
