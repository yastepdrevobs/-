
import java.util.Scanner;

public class Task_1 { // Оголошення класу Task_1
    private Scanner scanner;

    public void Task(Scanner scanner) { // Оголошення методу Task() для виконання завдання
        this.scanner = scanner;
        boolean exitTask = false;

        while (!exitTask) {
            System.out.println("\n\033[1mМеню завдання 1:\033[0m");
            System.out.println("1. Виведення масиву парних чисел");
            System.out.println("2. Виведення масиву непарних чисел");
            System.out.println("3. Повернутися до головного меню");
            System.out.print("Ваш вибір: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    executeTask1_1();
                    break;
                case "2":
                    executeTask1_2();
                    break;
                case "3":
                    exitTask = true;
                    break;
                default:
                    System.out.println("Некоректний ввід.");
            }
        }
    }

    private void executeTask1_1() {
        int[] evenNumbers = new int[50]; // Створення масиву парних чисел розміром 50
        System.out.println("\033[1mЗадання 1.1. Виведення масиву парних чисел:\033[0m");
        // Цикл для заповнення та виведення масиву з парними числами
        for (int i = 0, num = 2; i < evenNumbers.length; i++, num += 2) {
            evenNumbers[i] = num; // Заповнення елементу масиву парним числом
            System.out.print(num + " "); // Виведення масиву парних чисел
        }
        System.out.println(); // Виведення порожнього рядка
    }

    private void executeTask1_2() {
        int[] oddNumbers = new int[50]; // Створення масиву непарних чисел розміром 50
        System.out.println("\n\033[1mЗадання 1.2. Виведення масиву непарних чисел:\033[0m");
        // Цикл для заповнення та виведення масиву з непарними числами
        for (int i = 0, num = 1; i < oddNumbers.length; i++, num += 2) {
            oddNumbers[i] = num; // Заповнення елементу масиву непарним числом
            System.out.print(num + " "); // Виведення масиву непарних чисел
        }
        System.out.println(); // Виведення порожнього рядка
    }
}

