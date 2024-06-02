import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] tasksDisplayed = new boolean[6]; // Щоб відстежувати, які завдання вже були виведені
        boolean exit = false;

        while (!exit) {
            displayRemainingTasks(tasksDisplayed);
            System.out.println(" ");
            System.out.println("\n\033[1mВведіть номер завдання для виконання (1-6), або 'exit' для завершення:\033[0m");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                exit = true;
            } else {
                try {
                    int taskNumber = Integer.parseInt(input);
                    if (taskNumber >= 1 && taskNumber <= 6) {
                        executeTaskMenu(taskNumber, scanner); // Передача scanner до методу
                        tasksDisplayed[taskNumber - 1] = true;
                    } else {
                        System.out.println("Некоректний номер завдання. Будь ласка, введіть число від 1 до 6.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Некоректний ввід. Будь ласка, введіть число від 1 до 6 або 'exit'.");
                }
            }
        }
        System.out.println("Програма завершена.");
    }

    public static void displayRemainingTasks(boolean[] tasksDisplayed) {
        System.out.println(" ");
        System.out.println("\n\033[1mЗавдання, які ще не були виведені на консоль:\033[0m");
        boolean allDisplayed = true;
        for (int i = 0; i < tasksDisplayed.length; i++) {
            if (!tasksDisplayed[i]) {
                allDisplayed = false;
                System.out.println("Завдання " + (i + 1));
            }
        }
        if (allDisplayed) {
            System.out.println("Усі завдання вже були виведені на консоль.");
        }
    }

    public static void executeTaskMenu(int taskNumber, Scanner scanner) { // Додано scanner до параметрів
        switch (taskNumber) {
            case 1:
                Task_1 Zavd_1 = new Task_1();
                Zavd_1.Task(scanner); // Передача scanner до методу Task
                break;
            case 2:
                Task_2 Zavd_2 = new Task_2();
                Zavd_2.Task(scanner);
                break;
            case 3:
                Task_3 Zavd_3 = new Task_3();
                Zavd_3.Task(scanner);
                break;
            case 4:
                Task_4 Zavd_4 = new Task_4();
                Zavd_4.Task(scanner);
                break;
            case 5:
                Task_5 Zavd_5 = new Task_5();
                Zavd_5.Task(scanner);
                break;
            case 6:
                Task_6 Zavd_6 = new Task_6();
                Zavd_6.Task(scanner);
                break;
            default:
                System.out.println("Некоректний номер завдання.");
        }
    }
}