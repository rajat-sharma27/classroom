
public class VehicleMain {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car(180, "Petrol", 5),
            new Truck(120, "Diesel", 15),
            new Motorcycle(150, "Petrol", "Sports")
        };

        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println("-----");
        }
    }
}
