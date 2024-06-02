import java.util.Scanner;

public class Task_2 {
    private Scanner scanner;

    public void Task(Scanner scanner) {
        this.scanner = scanner;
        boolean exitTask = false;

        while (!exitTask) {
            System.out.println(" ");
            System.out.println("\n\033[1mМеню завдання 2:\033[0m");
            System.out.println("1. Знайти найменше з трьох чисел");
            System.out.println("2. Повернутися до головного меню");
            System.out.print("Ваш вибір: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    findMinimum();
                    break;
                case "2":
                    exitTask = true;
                    break;
                default:
                    System.out.println("Некоректний ввід.");
            }
        }
    }

    private void findMinimum() {
        while (true) {
            System.out.println("\033[1mПошук найменшого з трьох чисел\033[0m");
            System.out.println("Введіть три числа (через пробіл) або 'stop', щоб повернутися до меню:");

            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                return; // Повернення до меню
            }

            String[] inputs = input.split(" ");
            if (inputs.length != 3) {
                System.out.println("Некоректний ввід. Введіть рівно три числа.");
                continue; // Повідомлення про некоректний ввід і повторення циклу
            }

            try {
                double num1 = Double.parseDouble(inputs[0]);
                double num2 = Double.parseDouble(inputs[1]);
                double num3 = Double.parseDouble(inputs[2]);

                double min = findMinimum(num1, num2, num3);
                System.out.println("Найменше число: " + min);
            } catch (NumberFormatException e) {
                System.out.println("Некоректний ввід. Введіть числові значення.");
                continue; // Повідомлення про некоректний ввід і повторення циклу
            }
        }
    }

    private double findMinimum(double num1, double num2, double num3) {
        return Math.min(Math.min(num1, num2), num3);
    }
}
