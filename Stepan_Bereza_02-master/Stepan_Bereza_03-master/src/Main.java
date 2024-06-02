import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] tasksDisplayed = new boolean[5]; // Щоб відстежувати, які завдання вже були виведені
        boolean exit = false;

        while (!exit) {
            displayRemainingTasks(tasksDisplayed);
            System.out.println(" ");
            System.out.println("\n\033[1mВведіть номер завдання для виконання (1-5), або 'exit' для завершення:\033[0m");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                exit = true;
            } else {
                try {
                    int taskNumber = Integer.parseInt(input);
                    if (taskNumber >= 1 && taskNumber <= 5 && !tasksDisplayed[taskNumber - 1]) {
                        executeTask(taskNumber, scanner); // Передача scanner до методу
                        tasksDisplayed[taskNumber - 1] = true;
                    } else {
                        System.out.println("Некоректний номер завдання або завдання вже виконане.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Некоректний ввід. Будь ласка, введіть число від 1 до 5 або 'exit'.");
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

    public static void executeTask(int taskNumber, Scanner scanner) {
        switch (taskNumber) {
            case 1:
                Task_1 task1 = new Task_1();
                task1.Task(scanner);
                break;
            case 2:
                Task_2 task2 = new Task_2();
                task2.Task(scanner);
                break;
            case 3:
                Task_3 task3 = new Task_3();
                task3.Task(scanner);
                break;
            case 4:
                Task_4 task4 = new Task_4();
                task4.Task(scanner);
                break;
            case 5:
                Task_5 task5 = new Task_5(scanner);
                task5.run();
                break;
            default:
                System.out.println("Некоректний номер завдання.");
        }
    }

    public static boolean allTasksDisplayed(boolean[] tasksDisplayed) {
        for (boolean displayed : tasksDisplayed) {
            if (!displayed) {
                return false;
            }
        }
        return true;
    }
}

