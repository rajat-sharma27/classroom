// EmployeeManagementDemo.java
import java.util.*;

abstract class Employee {
    private String employeeId;
    private String name;
    private double baseSalary;

    public Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    public void displayDetails() {
        System.out.printf("ID: %s | Name: %s | Base Salary: %.2f%n", employeeId, name, baseSalary);
    }

    public abstract double calculateSalary();
}

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department {
    private String department;
    private double monthlyAllowance;

    public FullTimeEmployee(String id, String name, double baseSalary, double monthlyAllowance) {
        super(id, name, baseSalary);
        this.monthlyAllowance = monthlyAllowance;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + monthlyAllowance;
    }

    @Override
    public void assignDepartment(String dept) { this.department = dept; }

    @Override
    public String getDepartmentDetails() { return department == null ? "Unassigned" : department; }
}

class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String id, String name, double hourlyRate, int hoursWorked) {
        super(id, name, 0.0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void assignDepartment(String dept) { this.department = dept; }

    @Override
    public String getDepartmentDetails() { return department == null ? "Unassigned" : department; }
}

public class EmployeeManagementDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        FullTimeEmployee f1 = new FullTimeEmployee("F001", "Alice", 50000, 5000);
        PartTimeEmployee p1 = new PartTimeEmployee("P001", "Bob", 500, 40);

        f1.assignDepartment("Engineering");
        p1.assignDepartment("Support");

        employees.add(f1);
        employees.add(p1);

        for (Employee e : employees) {
            e.displayDetails();
            System.out.printf("Department: %s%n", (e instanceof Department) ? ((Department)e).getDepartmentDetails() : "N/A");
            System.out.printf("Calculated Salary: %.2f%n%n", e.calculateSalary());
        }
    }
}
