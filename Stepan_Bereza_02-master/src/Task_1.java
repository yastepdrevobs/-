import java.util.Scanner;

public class Task_1 {
    private Scanner scanner;

    public void Task(Scanner scanner) {
        this.scanner = scanner;
        boolean exitTask = false;

        while (!exitTask) {
            System.out.println(" ");
            System.out.println("\n\033[1mМеню завдання 1:\033[0m");
            System.out.println("1. Виконати завдання");
            System.out.println("2. Повернутися до головного меню");
            System.out.print("Ваш вибір: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    executeTask1();
                    break;
                case "2":
                    exitTask = true;
                    break;
                default:
                    System.out.println("Некоректний ввід.");
            }
        }
    }

    private void executeTask1() {
        System.out.println("\033[1mЗадання 1. Знаходження розв'язку квадратного рівняння\033[0m");
        System.out.println("Введіть коефіцієнти a, b та c квадратного рівняння ax^2 + bx + c = 0:");

        double a = readCoefficient("a");
        if (Double.isNaN(a))
            return; // Повернення до меню, якщо ввід перервано

        double b = readCoefficient("b");
        if (Double.isNaN(b))
            return; // Повернення до меню, якщо ввід перервано

        double c = readCoefficient("c");
        if (Double.isNaN(c))
            return; // Повернення до меню, якщо ввід перервано

        double D = b * b - (4 * a * c);

        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Розв'язки рівняння: x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0) {
            double x = -b / (2 * a);
            System.out.println("Рівняння має один розв'язок: x = " + x);
        } else {
            System.out.println("Рівняння не має дійсних розв'язків");
        }
    }

    private double readCoefficient(String coefficientName) {
        System.out.print(coefficientName + ": ");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("stop")) {
            return Double.NaN; // Позначаємо, що ввід перервано
        }
        return Double.parseDouble(input);
    }
}
