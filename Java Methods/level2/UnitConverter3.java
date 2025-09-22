public class UnitConverter3 {
    public static double convertFarhenheitToCelsius(double f) { return (f - 32) * 5 / 9; }
    public static double convertCelsiusToFarhenheit(double c) { return (c * 9 / 5) + 32; }
    public static double convertPoundsToKg(double p) { return p * 0.453592; }
    public static double convertKgToPounds(double kg) { return kg * 2.20462; }
    public static double convertGallonsToLiters(double g) { return g * 3.78541; }
    public static double convertLitersToGallons(double l) { return l * 0.264172; }
    public static void main(String[] args) {
        System.out.println("100F in C: " + convertFarhenheitToCelsius(100));
        System.out.println("0C in F: " + convertCelsiusToFarhenheit(0));
        System.out.println("50 pounds in kg: " + convertPoundsToKg(50));
        System.out.println("20 kg in pounds: " + convertKgToPounds(20));
        System.out.println("5 gallons in liters: " + convertGallonsToLiters(5));
        System.out.println("10 liters in gallons: " + convertLitersToGallons(10));
    }
}
