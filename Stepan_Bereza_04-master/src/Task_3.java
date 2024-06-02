
import java.util.Scanner;

public class Task_3 { // Оголошення класу Task_3
    private Scanner scanner;

    public void Task(Scanner scanner) { // Оголошення методу Task() для виконання завдання
        this.scanner = scanner;
        boolean exitTask = false;

        while (!exitTask) {
            System.out.println(" ");
            System.out.println("\n\033[1mМеню завдання 3:\033[0m");
            System.out.println("1. Виконати завдання");
            System.out.println("2. Повернутися до головного меню");
            System.out.print("Ваш вибір: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    executeTask3(scanner);
                    break;
                case "2":
                    exitTask = true;
                    break;
                default:
                    System.out.println("Некоректний ввід.");
            }
        }
    }

    private void executeTask3(Scanner scanner) {
        while (true) {
            System.out.println("\033[1mЗадання 3. Виведення суми елементів масиву\033[0m");
            System.out.println("Введіть елементи масиву (через пробіл) або 'stop', щоб повернутися до меню:");

            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                return; // Повернення до меню
            }

            String[] inputs = input.split(" ");
            double[] array = new double[inputs.length];
            try {
                for (int i = 0; i < inputs.length; i++) {
                    array[i] = Double.parseDouble(inputs[i]);
                }
            } catch (NumberFormatException e) {
                System.out.println("Некоректний ввід. Введіть числові значення.");
                continue; // Повідомлення про некоректний ввід і повторення циклу
            }

            double sum = calculateSum(array); // Виклик методу для обчислення суми елементів масиву
            System.out.println("Сума елементів масиву: " + sum); // Виведення суми елементів масиву
            break; // Завершення циклу після успішного вводу
        }
    }

    private double calculateSum(double[] array) { // Метод для обчислення суми елементів масиву
        double sum = 0; // Ініціалізація змінної для зберігання суми
        for (double num : array) { // Початок циклу для кожного елементу масиву
            sum += num; // Додавання поточного елементу до суми
        }
        return sum; // Повернення суми елементів масиву
    }
}
