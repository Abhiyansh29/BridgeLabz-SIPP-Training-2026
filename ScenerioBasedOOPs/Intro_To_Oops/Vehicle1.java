class Vehicle {

    // Instance Variables
    private String vehicleNumber;
    private String ownerName;
    private String vehicleType;

    // Constructor
    public Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Display Vehicle Details
    public void displayDetails() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Owner Name     : " + ownerName);
        System.out.println("Vehicle Type   : " + vehicleType);
        System.out.println("-----------------------------");
    }

    // Display only Cars
    public static void displayCars(Vehicle[] vehicles) {
        System.out.println("\n===== Cars =====");
        for (Vehicle v : vehicles) {
            if (v != null && v.vehicleType.equalsIgnoreCase("Car")) {
                v.displayDetails();
            }
        }
    }

    // Display only Bikes
    public static void displayBikes(Vehicle[] vehicles) {
        System.out.println("\n===== Bikes =====");
        for (Vehicle v : vehicles) {
            if (v != null && v.vehicleType.equalsIgnoreCase("Bike")) {
                v.displayDetails();
            }
        }
    }
}

public class Vehicle1 {
    public static void main(String[] args) {

        // Array to store 10 vehicles
        Vehicle[] vehicles = new Vehicle[10];

        vehicles[0] = new Vehicle("UP81AB1234", "Rahul", "Car");
        vehicles[1] = new Vehicle("UP81CD5678", "Priya", "Bike");
        vehicles[2] = new Vehicle("DL05EF1111", "Amit", "Car");
        vehicles[3] = new Vehicle("HR26GH2222", "Neha", "Bike");
        vehicles[4] = new Vehicle("UP14IJ3333", "Rohan", "Car");
        vehicles[5] = new Vehicle("RJ20KL4444", "Simran", "Bike");
        vehicles[6] = new Vehicle("MP09MN5555", "Ankit", "Car");
        vehicles[7] = new Vehicle("PB10OP6666", "Karan", "Bike");
        vehicles[8] = new Vehicle("UK07QR7777", "Sneha", "Car");
        vehicles[9] = new Vehicle("UP32ST8888", "Vikas", "Bike");

        // Display Cars
        Vehicle.displayCars(vehicles);

        // Display Bikes
        Vehicle.displayBikes(vehicles);
    }
}