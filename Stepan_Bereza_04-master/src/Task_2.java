import java.util.Scanner;

public class Task_2 { // Оголошення класу Task_2
    private Scanner scanner;

    public void Task(Scanner scanner) { // Оголошення методу Task() для виконання завдання
        this.scanner = scanner;
        boolean exitTask = false;
        int[] numbers = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18}; // Оголошення та ініціалізація масиву чисел

        while (!exitTask) {
            System.out.println("\n\033[1mМеню завдання 2:\033[0m");
            System.out.println("1. Перебір масиву циклом while");
            System.out.println("2. Перебір масиву циклом for");
            System.out.println("3. Перебір масиву циклом while та виведення чисел з непарним індексом");
            System.out.println("4. Перебір масиву циклом for та виведення чисел з парним індексом");
            System.out.println("5. Виведення масиву в зворотньому порядку");
            System.out.println("6. Повернутися до головного меню");
            System.out.print("Ваш вибір: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    executeTask2_1(numbers);
                    break;
                case "2":
                    executeTask2_2(numbers);
                    break;
                case "3":
                    executeTask2_3(numbers);
                    break;
                case "4":
                    executeTask2_4(numbers);
                    break;
                case "5":
                    executeTask2_5(numbers);
                    break;
                case "6":
                    exitTask = true;
                    break;
                default:
                    System.out.println("Некоректний ввід.");
            }
        }
    }

    // Завдання 2.1: перебір масиву циклом while
    private void executeTask2_1(int[] array) {
        System.out.println("\n\033[1mЗадання 2.1. Перебір масиву циклом while:\033[0m");
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println(); // Виведення порожнього рядка
    }

    // Завдання 2.2: перебір масиву циклом for
    private void executeTask2_2(int[] array) {
        System.out.println("\n\033[1mЗадання 2.2. Перебір масиву циклом for:\033[0m");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Виведення порожнього рядка
    }

    // Завдання 2.3: перебір масиву циклом while та виведення чисел з непарним індексом
    private void executeTask2_3(int[] array) {
        System.out.println("\n\033[1mЗадання 2.3. Перебір масиву циклом while та виведення чисел з непарним індексом:\033[0m");
        int i = 1;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i += 2;
        }
        System.out.println(); // Виведення порожнього рядка
    }

    // Завдання 2.4: перебір масиву циклом for та виведення чисел з парним індексом
    private void executeTask2_4(int[] array) {
        System.out.println("\n\033[1mЗадання 2.4. Перебір масиву циклом for та виведення чисел з парним індексом:\033[0m");
        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Виведення порожнього рядка
    }

    // Завдання 2.5: виведення масиву в зворотньому порядку
    private void executeTask2_5(int[] array) {
        System.out.println("\n\033[1mЗадання 2.5. Виведення масиву в зворотньому порядку:\033[0m");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Виведення порожнього рядка
    }
}
