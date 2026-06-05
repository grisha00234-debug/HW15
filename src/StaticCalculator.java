public class StaticCalculator {
    private static double result;

    public static void add(double a, double b) {
        result = a + b;
    }

    public static void subtract(double a, double b) {
        result = a - b;
    }

    public static void multiply(double a, double b) {
        result = a * b;
    }

    public static void divide(double a, double b) {
        if (b == 0) {
            System.out.println("Деление на ноль нельзя");

        }
        result = a / b;
    }

    public static void clear() {
        result = 0;
    }

    public static double getResult() {
        return result;
    }
}




