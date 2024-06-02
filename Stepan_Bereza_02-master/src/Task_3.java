import java.util.Scanner;

public class Task_3 {
    public void Task(Scanner scanner) {
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
        System.out.println("\033[1mЗадання 3. Визначення чи є число двозначним і парним\033[0m");
        int number = readNumber(scanner);

        if (number == Integer.MIN_VALUE)
            return; // Повернення до меню, якщо ввід перервано

        if (number >= 10 && number <= 99) {
            if (number % 2 == 0) {
                System.out.println("Число є двозначним і парним");
            } else {
                System.out.println("Число є двозначним, але не парним");
            }
        } else {
            System.out.println("Число не є двозначним");
        }
    }

    private int readNumber(Scanner scanner) {
        System.out.print("Введіть число для перевірки (або 'stop' для виходу): ");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("stop")) {
            return Integer.MIN_VALUE; // Позначаємо, що ввід перервано
        }
        return Integer.parseInt(input);
    }
}

