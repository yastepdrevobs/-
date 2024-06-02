import java.util.Arrays;
import java.util.Scanner;

public class Task_4 {
    private Scanner scanner;

    public void Task(Scanner scanner) {
        this.scanner = scanner;
        boolean exitTask = false;

        while (!exitTask) {
            System.out.println(" ");
            System.out.println("\n\033[1mМеню завдання 4:\033[0m");
            System.out.println("1. Виконати завдання");
            System.out.println("2. Повернутися до головного меню");
            System.out.print("Ваш вибір: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    executeTask4();
                    break;
                case "2":
                    exitTask = true;
                    break;
                default:
                    System.out.println("Некоректний ввід.");
            }
        }
    }

    private void executeTask4() {
        int[] numbers = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};
        Task_1(numbers);
        System.out.println("\n\033[1mЗадання 4. Виведення масиву, зі зміненими знаками непарних елементів\033[0m");
        System.out.println("Масив після зміни знаку непарних елементів: " + Arrays.toString(numbers));
    }

    public static void Task_1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] *= -1;
            }
        }
    }
}
