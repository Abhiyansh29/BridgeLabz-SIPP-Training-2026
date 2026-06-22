class ChargingStation {

    // Static Variables
    static int totalStations = 0;
    static double electricityRate = 8.50; // Rate per unit

    // Instance Variables
    private int stationId;
    private double unitsConsumed;

    // Constructor
    public ChargingStation(int stationId, double unitsConsumed) {
        this.stationId = stationId;      // using this keyword
        this.unitsConsumed = unitsConsumed;
        totalStations++;                 // Increment total stations
    }

    // Calculate Bill
    public double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    // Display Station Details
    public void displayStationDetails() {
        System.out.println("Station ID       : " + stationId);
        System.out.println("Units Consumed   : " + unitsConsumed);
        System.out.println("Rate per Unit    : ₹" + electricityRate);
        System.out.println("Total Bill       : ₹" + calculateBill());
        System.out.println("-------------------------------");
    }
}

public class ChargingStation1 {
    public static void main(String[] args) {

        // Create 5 charging stations
        ChargingStation s1 = new ChargingStation(101, 120);
        ChargingStation s2 = new ChargingStation(102, 150);
        ChargingStation s3 = new ChargingStation(103, 180);
        ChargingStation s4 = new ChargingStation(104, 200);
        ChargingStation s5 = new ChargingStation(105, 250);

        System.out.println("Electricity Rate = ₹" + ChargingStation.electricityRate + " per unit\n");

        // Display bills
        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        System.out.println("Total Stations Created: " + ChargingStation.totalStations);

        // Change electricity rate
        ChargingStation.electricityRate = 10.00;

        System.out.println("\nAfter Changing Electricity Rate to ₹10.00 per unit:\n");

        // Bills automatically use new rate
        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();
    }
}