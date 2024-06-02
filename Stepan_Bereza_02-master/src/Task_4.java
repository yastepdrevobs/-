import java.util.Scanner;

public class Task_4 {
    private Scanner scanner;

    public void Task(Scanner scanner) {
        this.scanner = scanner;
        boolean exitTask = false;

        while (!exitTask) {
            System.out.println("\n\033[1mМеню завдання 4:\033[0m");
            System.out.println("1. Обчислити f(x)");
            System.out.println("2. Визначити кількість днів у місяці");
            System.out.println("3. Повернутися до головного меню");
            System.out.print("Ваш вибір: ");

            // Перевірка наявності наступного рядка перед зчитуванням введення користувача
            if (scanner.hasNextLine()) {
                String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        executeTask4_1();
                        break;
                    case "2":
                        executeTask4_2();
                        break;
                    case "3":
                        exitTask = true;
                        break;
                    default:
                        System.out.println("Некоректний ввід.");
                }
            } else {
                System.out.println("Некоректний ввід.");
                exitTask = true;
            }
        }
    }

    private void executeTask4_1() {
        System.out.println("\033[1mЗадання 4.1. Обчислення f(x) за заданою функцією\033[0m");
        System.out.println("Введіть значення x для обчислення f(x):");
        double inputX = readDoubleInput();

        if (Double.isNaN(inputX))
            return;

        double result;

        if (inputX < -2) {
            result = 1 / Math.tan(inputX);
        } else if (inputX >= -2 && inputX <= 2) {
            result = 9 * inputX * inputX;
        } else {
            result = Math.sin(inputX) * Math.sin(inputX);
        }

        System.out.println("f(" + inputX + ") = " + result);
    }

    private void executeTask4_2() {
        System.out.println("\033[1mЗадання 4.2. Визначення кількості днів у місяці\033[0m");
        System.out.println("Введіть номер місяця:");
        int month = readIntInput();

        if (month == Integer.MIN_VALUE)
            return;

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("У цьому місяці 31 день.");
                break;
            case 4, 6, 9, 11:
                System.out.println("У цьому місяці 30 днів.");
                break;
            case 2:
                System.out.println("У цьому місяці 28 або 29 днів.");
                break;
            default:
                System.out.println("Введений неправильний номер місяця.");
        }
    }

    private double readDoubleInput() {
        System.out.print("Введіть значення (або 'stop' для виходу): ");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("stop")) {
            return Double.NaN;
        }
        return Double.parseDouble(input);
    }

    private int readIntInput() {
        System.out.print("Введіть номер (або 'stop' для виходу): ");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("stop")) {
            return Integer.MIN_VALUE;
        }
        return Integer.parseInt(input);
    }
}
