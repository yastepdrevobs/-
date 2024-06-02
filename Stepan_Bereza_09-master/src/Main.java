import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] tasksDisplayed = new boolean[2]; // Щоб відстежувати, які завдання вже були виведені
        boolean exit = false;

        while (!exit) {
            displayRemainingTasks(tasksDisplayed);
            System.out.println(" ");
            System.out.println("\n\033[1mВведіть номер завдання для виконання (1-2), або 'exit' для завершення:\033[0m");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                exit = true;
            } else {
                try {
                    int taskNumber = Integer.parseInt(input);
                    if (taskNumber >= 1 && taskNumber <= 2) {
                        executeTaskMenu(taskNumber); // Передача scanner до методу
                        tasksDisplayed[taskNumber - 1] = true;
                    } else {
                        System.out.println("Некоректний номер завдання. Будь ласка, введіть число від 1 до 2.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Некоректний ввід. Будь ласка, введіть число від 1 до 2 або 'exit'.");
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

    public static void executeTaskMenu(int taskNumber) { // Додано scanner до параметрів
        switch (taskNumber) {
            case 1:
                Task_1 Zavd_1 = new Task_1();
                Zavd_1.Task(); // Передача scanner до методу Task
                break;
            case 2:
                Task_2 Zavd_2 = new Task_2();
                Zavd_2.Task();
                break;
            default:
                System.out.println("Некоректний номер завдання.");
        }
    }
}