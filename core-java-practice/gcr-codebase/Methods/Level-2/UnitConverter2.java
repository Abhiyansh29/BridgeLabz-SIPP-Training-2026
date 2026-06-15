public class UnitConverter2 {
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        System.out.println("5 yards in feet = " + convertYardsToFeet(5));
        System.out.println("15 feet in yards = " + convertFeetToYards(15));
        System.out.println("2 meters in inches = " + convertMetersToInches(2));
        System.out.println("10 inches in meters = " + convertInchesToMeters(10));
        System.out.println("12 inches in cm = " + convertInchesToCm(12));
    }
}
