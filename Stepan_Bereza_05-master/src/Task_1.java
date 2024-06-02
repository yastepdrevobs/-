
import java.util.Scanner;

public class Task_1 {
    private Scanner scanner;

    public void Task(Scanner scanner) {
        this.scanner = scanner;
        boolean exitTask = false;

        while (!exitTask) {
            System.out.println(" ");
            System.out.println("\n\033[1mМеню завдання 1:\033[0m");
            System.out.println("1. Обчислити площу паралелограма");
            System.out.println("2. Повернутися до головного меню");
            System.out.print("Ваш вибір: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    calculateParallelogramArea();
                    break;
                case "2":
                    exitTask = true;
                    break;
                default:
                    System.out.println("Некоректний ввід.");
            }
        }
    }

    private void calculateParallelogramArea() {
        System.out.println("\033[1mОбчислення площі паралелограма\033[0m");

        double side1 = readSide("першої");
        if (side1 == -1) return;

        double side2 = readSide("другої");
        if (side2 == -1) return;

        double angle = readAngle();
        if (angle == -1) return;

        double area = calculateArea(side1, side2, angle);
        System.out.println("Площа паралелограма: " + area);
    }

    private double readSide(String sideName) {
        System.out.print("Довжина " + sideName + " сторони (або 'stop' для виходу): ");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("stop")) {
            return -1; // Вихід з методу, якщо користувач ввів "stop"
        }
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            System.out.println("Некоректний ввід. Введіть числове значення або 'stop' для виходу.");
            return readSide(sideName); // Рекурсивний виклик, якщо введено некоректні дані
        }
    }

    private double readAngle() {
        System.out.print("Кут (у градусах) (або 'stop' для виходу): ");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("stop")) {
            return -1; // Вихід з методу, якщо користувач ввів "stop"
        }
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            System.out.println("Некоректний ввід. Введіть числове значення або 'stop' для виходу.");
            return readAngle(); // Рекурсивний виклик, якщо введено некоректні дані
        }
    }

    private double calculateArea(double side1, double side2, double angle) {
        return side1 * side2 * Math.sin(Math.toRadians(angle));
    }
}
