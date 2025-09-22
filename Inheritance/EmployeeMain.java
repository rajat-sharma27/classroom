
public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Manager("Alice", 101, 80000, 10);
        Employee e2 = new Developer("Bob", 102, 60000, "Java");
        Employee e3 = new Intern("Charlie", 103, 20000, "6 months");

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
