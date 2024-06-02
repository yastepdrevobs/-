import java.util.Scanner;
import java.util.Arrays;

public class Task_3 {
    private Scanner scanner;

    public void Task(Scanner scanner) {
        this.scanner = scanner;
        boolean exitTask = false;

        while (!exitTask) {
            System.out.println(" ");
            System.out.println("\n\033[1mМеню завдання 3:\033[0m");
            System.out.println("1. Вивести масив");
            System.out.println("2. Повернутися до головного меню");
            System.out.print("Ваш вибір: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    printArray();
                    break;
                case "2":
                    exitTask = true;
                    break;
                default:
                    System.out.println("Некоректний ввід.");
            }
        }
    }

    private void printArray() {
        System.out.println("\033[1mВиведення масиву\033[0m");

        System.out.println("Введіть елементи масиву через пробіл (або 'stop' для виходу):");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("stop")) {
            return; // Вихід з методу, якщо користувач ввів "stop"
        }

        String[] inputs = input.split(" ");
        System.out.println("Масив: " + Arrays.toString(inputs));
    }
}
