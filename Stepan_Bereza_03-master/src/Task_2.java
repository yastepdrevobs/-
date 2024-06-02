import java.util.Scanner;

public class Task_2 { // Оголошення класу Task_2
    private Scanner scanner;

    public void Task(Scanner scanner) { // Оголошення методу Task() для виконання завдання
        this.scanner = scanner;
        boolean exitTask = false;

        while (!exitTask) {
            System.out.println("\n\033[1mМеню завдання 2:\033[0m");
            System.out.println("1. Вивести інформацію на консоль за допомогою циклу for");
            System.out.println("2. Повернутися до головного меню");
            System.out.print("Ваш вибір: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    executeTask2();
                    break;
                case "2":
                    exitTask = true;
                    break;
                default:
                    System.out.println("Некоректний ввід.");
            }
        }
    }

    private void executeTask2() {
        System.out.println("\n\033[1mЗавдання 2. Виведення інформації на консоль за допомогою циклу for\033[0m");
        // Вкладений цикл for для виведення інформації про години та хвилини
        for (int hours = 0; hours < 3; hours++) { // цикл для годин
            for (int minutes = 0; minutes < 60; minutes++) { // цикл для хвилин
                // Виведення на консоль інформації про години та хвилини
                System.out.println(hours + " год " + minutes + " хв");
            }
        }
    }
}
