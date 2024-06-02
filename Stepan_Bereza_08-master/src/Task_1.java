import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
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
        System.out.print("Введіть ім'я файлу: ");
        String fileName = scanner.nextLine();
        if (fileName.equalsIgnoreCase("stop")) {
            return;
        }

        System.out.print("Введіть нижню межу діапазону: ");
        int lowerBound = readIntegerInput();
        if (lowerBound == Integer.MIN_VALUE) {
            return;
        }

        System.out.print("Введіть верхню межу діапазону: ");
        int upperBound = readIntegerInput();
        if (upperBound == Integer.MIN_VALUE) {
            return;
        }

        System.out.print("Введіть кількість випадкових чисел: ");
        int count = readIntegerInput();
        if (count == Integer.MIN_VALUE) {
            return;
        }

        writeRandomNumbersToFile(fileName, lowerBound, upperBound, count);
    }

    private int readIntegerInput() {
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("stop")) {
            return Integer.MIN_VALUE; // Позначаємо, що ввід перервано
        }
        return Integer.parseInt(input);
    }

    private void writeRandomNumbersToFile(String fileName, int lowerBound, int upperBound, int count) {
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            }

            PrintWriter writer = new PrintWriter(new FileWriter(file, true));
            Random random = new Random();

            for (int i = 0; i < count; i++) {
                int randomNumber = lowerBound + random.nextInt(upperBound - lowerBound + 1);
                writer.println(randomNumber);
            }

            writer.close();
            System.out.println("Випадкові числа успішно записані в файл " + fileName);

        } catch (IOException e) {
            System.out.println("Виникла помилка під час запису в файл: " + e.getMessage());
        }
    }
}
