class Vehicle {
    protected String vehicleName;

    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public double fuelCost(double km) {
        return 0;
    }
}

class Car extends Vehicle {
    public Car(String vehicleName) {
        super(vehicleName);
    }

    @Override
    public double fuelCost(double km) {
        return km * 8;
    }
}

class Bus extends Vehicle {
    public Bus(String vehicleName) {
        super(vehicleName);
    }

    @Override
    public double fuelCost(double km) {
        return km * 20;
    }
}

class Bike extends Vehicle {
    public Bike(String vehicleName) {
        super(vehicleName);
    }

    @Override
    public double fuelCost(double km) {
        return km * 3;
    }
}

// Added later without modifying existing classes
class ElectricCar extends Vehicle {
    public ElectricCar(String vehicleName) {
        super(vehicleName);
    }

    @Override
    public double fuelCost(double km) {
        return km * 1.5;
    }
}

public class TransportCompanySystem {
    public static void main(String[] args) {

        Vehicle[] fleet = {
                new Car("Honda City"),
                new Bus("Volvo Bus"),
                new Bike("Royal Enfield"),
                new ElectricCar("Tesla")
        };

        double km = 100;

        for (Vehicle v : fleet) {

            System.out.println(v.vehicleName +
                    " Fuel Cost = ₹" + v.fuelCost(km));

            if (v instanceof Car) {
                System.out.println("Type: Car");
            } else if (v instanceof Bus) {
                System.out.println("Type: Bus");
            } else if (v instanceof Bike) {
                System.out.println("Type: Bike");
            } else if (v instanceof ElectricCar) {
                System.out.println("Type: Electric Car");
            }

            System.out.println();
        }
    }
}