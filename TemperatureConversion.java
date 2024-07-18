public class TemperatureConversion {
    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }

    public static void main(String[] args) {
        // Print table header
        System.out.printf("%-10s%15s     |     %-15s%10s%n", "Celsius", "Fahrenheit", "Fahrenheit", "Celsius");
        System.out.println("-------------------------------------------------------------");

        for (int celsius = 40, fahrenheit = 120; celsius >= 31; celsius--, fahrenheit -= 10) {
            double fahrenheitConverted = celsiusToFahrenheit(celsius);
            double celsiusConverted = fahrenheitToCelsius(fahrenheit);
            System.out.printf("%-10d%15.1f     |     %-15d%10.2f%n", celsius, fahrenheitConverted, fahrenheit, celsiusConverted);
        }
    }
}
