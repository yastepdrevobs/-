import java.util.Scanner;

public class Task_4 {
    private Scanner scanner;

    public void Task(Scanner scanner) {
        this.scanner = scanner;
        boolean exitTask = false;

        while (!exitTask) {
            System.out.println(" ");
            System.out.println("\n\033[1mМеню завдання 4:\033[0m");
            System.out.println("1. Знайти найбільше число в масиві");
            System.out.println("2. Повернутися до головного меню");
            System.out.print("Ваш вибір: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    findMaxNumber();
                    break;
                case "2":
                    exitTask = true;
                    break;
                default:
                    System.out.println("Некоректний ввід.");
            }
        }
    }

    private void findMaxNumber() {
        System.out.println("\033[1mПошук найбільшого числа в масиві\033[0m");

        System.out.println("Введіть елементи масиву через пробіл (або 'stop' для виходу):");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("stop")) {
            return; // Вихід з методу, якщо користувач ввів "stop"
        }

        String[] inputs = input.split(" ");
        int[] array = new int[inputs.length];
        try {
            for (int i = 0; i < inputs.length; i++) {
                array[i] = Integer.parseInt(inputs[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Некоректний ввід. Введіть числові значення.");
            return;
        }

        int maxNumber = findMax(array);
        System.out.println("Найбільше число в масиві: " + maxNumber);
    }

    private int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
