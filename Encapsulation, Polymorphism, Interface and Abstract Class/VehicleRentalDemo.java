// VehicleRentalDemo.java
import java.util.*;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRatePerDay;

    public Vehicle(String vehicleNumber, String type, double rentalRatePerDay) {
        this.vehicleNumber = vehicleNumber; this.type = type; this.rentalRatePerDay = rentalRatePerDay;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRatePerDay() { return rentalRatePerDay; }
    public void setRentalRatePerDay(double rentalRatePerDay) { this.rentalRatePerDay = rentalRatePerDay; }

    public abstract double calculateRentalCost(int days);
    public void display() { System.out.printf("%s [%s] - Rate/day: %.2f%n", vehicleNumber, type, rentalRatePerDay); }
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    private String policyNumber;
    public Car(String num, double rate, String policyNumber) { super(num, "Car", rate); this.policyNumber = policyNumber; }
    @Override public double calculateRentalCost(int days) { return getRentalRatePerDay() * days; }
    @Override public double calculateInsurance() { return 200.0; }
    @Override public String getInsuranceDetails() { return "Policy: ****" + (policyNumber == null ? "N/A" : policyNumber.substring(Math.max(0, policyNumber.length()-4))); }
}

class Bike extends Vehicle {
    public Bike(String num, double rate) { super(num, "Bike", rate); }
    @Override public double calculateRentalCost(int days) { return getRentalRatePerDay() * days * 0.9; }
}

class Truck extends Vehicle implements Insurable {
    private String policyNumber;
    public Truck(String num, double rate, String policyNumber) { super(num, "Truck", rate); this.policyNumber = policyNumber; }
    @Override public double calculateRentalCost(int days) { return getRentalRatePerDay() * days * 1.5; }
    @Override public double calculateInsurance() { return 500.0; }
    @Override public String getInsuranceDetails() { return "Policy: ****" + (policyNumber == null ? "N/A" : policyNumber.substring(Math.max(0, policyNumber.length()-4))); }
}

public class VehicleRentalDemo {
    public static void main(String[] args) {
        List<Vehicle> fleet = List.of(
                new Car("KA01AA1111", 3000, "CARPOL1234"),
                new Bike("KA01BB2222", 500),
                new Truck("KA01CC3333", 8000, "TRKPOL5678")
        );
        int days = 3;
        for (Vehicle v : fleet) {
            v.display();
            System.out.printf("Rental cost for %d days: %.2f%n", days, v.calculateRentalCost(days));
            if (v instanceof Insurable) {
                Insurable i = (Insurable) v;
                System.out.printf("Insurance: %.2f | %s%n", i.calculateInsurance(), i.getInsuranceDetails());
            }
            System.out.println();
        }
    }
}
