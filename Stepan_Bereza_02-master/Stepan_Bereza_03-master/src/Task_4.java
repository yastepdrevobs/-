import java.util.Scanner;

public class Task_4 { // Оголошення класу Task_4
    private Scanner scanner;

    public void Task(Scanner scanner) { // Оголошення методу Task() для виконання завдання
        this.scanner = scanner;
        boolean exitTask = false;

        while (!exitTask) {
            System.out.println("\n\033[1mМеню завдання 4:\033[0m");
            System.out.println("1. Виведення інформації на консоль за допомогою циклу for");
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
        System.out.println("\n\033[1mЗавдання 4. Виведення інформації на консоль за допомогою циклу for\033[0m");
        // Вкладений цикл for для ітерації по годинах
        for (int h = 0; h < 3; h++) { // Поки години менше за 3
            // Вкладений цикл for для ітерації по хвилинах
            for (int m = 0; m < 60; m++) { // Поки хвилини менше за 60
                // Вкладений цикл for для ітерації по секундах
                for (int s = 0; s < 60; s++) { // Поки секунди менше за 60
                    // Виведення на консоль інформації про години, хвилини та секунди
                    System.out.println(h + " год " + m + " хв " + s + " сек");
                }
            }
        }
    }
}
