 class Drone {

    // Instance Variables
    private int droneId;
    private int batteryPercentage;

    // Static Variable
    static String companyName = "SkyExpress Logistics";

    // Constructor
    public Drone(int droneId, int batteryPercentage) {
        this.droneId = droneId;               // using this keyword
        this.batteryPercentage = batteryPercentage;
    }

    // Method to start delivery
    public void startDelivery() {
        if (batteryPercentage >= 30) {
            System.out.println("Drone " + droneId + " started delivery.");
            batteryPercentage -= 20; // Battery consumed
        } else {
            System.out.println("Drone " + droneId + " cannot start delivery. Battery too low!");
        }
    }

    // Method to display drone status
    public void displayStatus() {
        System.out.println("Company Name      : " + companyName);
        System.out.println("Drone ID          : " + droneId);
        System.out.println("Battery Percentage: " + batteryPercentage + "%");
        System.out.println("--------------------------------");
    }

 }
public class Drone1{
    public static void main(String[] args) {

        // Creating multiple drones
        Drone d1 = new Drone(101, 90);
        Drone d2 = new Drone(102, 50);
        Drone d3 = new Drone(103, 20);

        // Starting delivery
        d1.startDelivery();
        d2.startDelivery();
        d3.startDelivery();

        System.out.println();

        // Display status
        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();

        // Verifying static variable
        System.out.println("Company Name from d1: " + Drone.companyName);
        System.out.println("Company Name from d2: " + Drone.companyName);
        System.out.println("Company Name from d3: " + Drone.companyName);
    }
}

