public class UnitConverter3 {
    public static double convertFahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double convertPoundsToKg(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKgToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        System.out.println("100F in C = " + convertFahrenheitToCelsius(100));
        System.out.println("0C in F = " + convertCelsiusToFahrenheit(0));
        System.out.println("10 pounds in kg = " + convertPoundsToKg(10));
        System.out.println("20 kg in pounds = " + convertKgToPounds(20));
        System.out.println("5 gallons in liters = " + convertGallonsToLiters(5));
        System.out.println("10 liters in gallons = " + convertLitersToGallons(10));
    }
}
