import java.util.Scanner;

public class Task_1 { // Оголошення класу Task_1
    private Scanner scanner;

    public void Task(Scanner scanner) { // Оголошення методу Task() для виконання завдання
        this.scanner = scanner;
        boolean exitTask = false;

        while (!exitTask) {
            System.out.println("\n\033[1mМеню завдання 1:\033[0m");
            System.out.println("1. Вивести фразу за допомогою циклу for");
            System.out.println("2. Вивести фразу за допомогою циклу while");
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
        System.out.println("\n\033[1mЗавдання 1.1. Виведення фрази за допомогою циклу for\033[0m");
        String phrase = "Інститут ІТРЕ найкращий!!!";
        for (int i = 0; i < 30; i++) {
            System.out.println(phrase);
        }
    }

    private void executeTask1_2() {
        System.out.println("\n\033[1mЗавдання 1.2. Виведення фрази за допомогою циклу while\033[0m");
        String phrase = "Інститут ІТРЕ найкращий!!!";
        int counter = 0;
        while (counter < 30) {
            System.out.println(phrase);
            counter++;
        }
    }
}
