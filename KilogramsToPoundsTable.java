public class KilogramsToPoundsTable {
    public static void main(String[] args) {
        final double POUNDS_PER_KILOGRAM = 2.2;
        System.out.printf("%-10s%10s%n", "Kilograms", "Pounds");

        for (int kg = 1; kg <= 199; kg += 2) {
            double pounds = kg * POUNDS_PER_KILOGRAM;
            System.out.printf("%-10d%10.1f%n", kg, pounds);
        }
    }
}
