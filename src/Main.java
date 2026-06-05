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
            System.out.print("Введите первое число: ");
            double numberA = scanner.nextDouble();
            System.out.print("Введите второе число: ");
            double numderB = scanner.nextDouble();
            System.out.println("Выберите операцию");
            operation = scanner.next();
            if(operation.equalsIgnoreCase("+")){
                StaticCalculator.add(numberA, numderB);
            }else if(operation.equalsIgnoreCase("*")){
                StaticCalculator.multiply(numberA,numderB);
            }else if(operation.equalsIgnoreCase("/")){
                StaticCalculator.divide(numberA,numderB);
            }else if(operation.equalsIgnoreCase("-")){
                StaticCalculator.subtract(numberA, numderB);
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





