public class StaticCalculator {
    private static double result;

    public static void add(double number, String operetion) {
        result += number;
    }

    public static void subtract(double number, String operetion) {
        result -= number;
    }

    public static void multiply(double number, String operetion) {
        result *= number;
    }

    public static void divide(double number, String operetion) {
        if (number == 0) {
            System.out.println("Деление на ноль нельзя");
            return;
        }
        result /= number;
    }

    public static void clear() {
        result = 0;
    }

    public static double getResult() {
        return result;
    }
}




