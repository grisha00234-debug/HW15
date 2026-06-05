import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean work = true;

        while (work) {
            System.out.println("Текущий результат: " + StaticCalculator.getResult());

            System.out.println("Введите операцию (+, -, *, /), или сотрите текощий результат");
            String operation = scanner.next();
            if (operation.equalsIgnoreCase("Стереть")){
                StaticCalculator.clear();
                System.out.println("Результат = 0");
                
            }


            System.out.print("Введите число: ");
            double number = scanner.nextDouble();
            System.out.println("Выберите операцию");
            operation = scanner.next();
            switch (operation) {
                case "+":
                    StaticCalculator.add(number);
                    break;

                case "-":
                    StaticCalculator.subtract(number);
                    break;

                case "*":
                    StaticCalculator.multiply(number);
                    break;

                case "/":
                    StaticCalculator.divide(number);
                    break;

                default:
                    System.out.println("Неизвестная операция!");
                    continue;
            }

            System.out.println("Результат = " + StaticCalculator.getResult());

            System.out.print("Продолжить? (да/нет): ");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase("нет")) {
                work = false;
            }
        }

        System.out.println("Программа завершена.");

    }
}





