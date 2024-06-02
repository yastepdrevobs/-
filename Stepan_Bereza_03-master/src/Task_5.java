import java.util.Scanner;

public class Task_5 {
    private Scanner scanner;

    public Task_5(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        boolean exitTask = false;

        while (!exitTask) {
            System.out.println("\n\033[1mМеню завдання 5:\033[0m");
            System.out.println("1. Реалізація програми за допомогою циклу while");
            System.out.println("2. Реалізація програми за допомогою циклу for");
            System.out.println("3. Повернутися до головного меню");
            System.out.print("Ваш вибір: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    task1();
                    break;
                case "2":
                    task2();
                    break;
                case "3":
                    exitTask = true;
                    break;
                default:
                    System.out.println("Некоректний ввід.");
            }
        }
    }

    private void task1() {
        boolean exitSubTask = false;

        while (!exitSubTask) {
            System.out.println("\n\033[1mЗадання 5.1. Реалізація програми за допомогою циклу while\033[0m");
            System.out.println("1. Виконати підтаску 1");
            System.out.println("2. Повернутися до меню завдання 5");
            System.out.print("Ваш вибір: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    executeTask1();
                    break;
                case "2":
                    exitSubTask = true;
                    break;
                default:
                    System.out.println("Некоректний ввід.");
            }
        }
    }

    private void task2() {
        boolean exitSubTask = false;

        while (!exitSubTask) {
            System.out.println("\n\033[1mЗадання 5.2. Реалізація програми за допомогою циклу for\033[0m");
            System.out.println("1. Виконати підтаску 2");
            System.out.println("2. Повернутися до меню завдання 5");
            System.out.print("Ваш вибір: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    executeTask2();
                    break;
                case "2":
                    exitSubTask = true;
                    break;
                default:
                    System.out.println("Некоректний ввід.");
            }
        }
    }

    private void executeTask1() {
        System.out.println("\n\033[1mЗадання 5.1. Реалізація програми за допомогою циклу while\033[0m");
        System.out.println("Введіть початок і кінець діапазону через пробіл (або 'stop' для виходу):");

        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("stop")) {
            return;
        }

        String[] values = input.split(" ");
        double start = Double.parseDouble(values[0]);
        double end = Double.parseDouble(values[1]);

        int countInRange = 0;
        double step = 0.2;
        double x = 0;

        while (x <= 4) {
            double fx = 3 * x - 4 * Math.sin(x * x);
            if (fx >= start && fx <= end) {
                countInRange++;
            }
            x += step;
        }

        if (countInRange > 0) {
            System.out.println("Кількість значень функції у діапазоні [" + start + ", " + end + "]: " + countInRange);
        } else {
            System.out.println("Значень функції у вказаному діапазоні немає.");
        }

        System.out.println("Ви виконали підтаску 1.");
    }

    private void executeTask2() {
        System.out.println("\n\033[1mЗадання 5.2. Реалізація програми за допомогою циклу for\033[0m");
        System.out.println("Введіть початок і кінець діапазону через пробіл (або 'stop' для виходу):");

        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("stop")) {
            return;
        }

        String[] values = input.split(" ");
        double start = Double.parseDouble(values[0]);
        double end = Double.parseDouble(values[1]);

        int countInRange = 0;
        double step = 0.2;

        for (double x = 0; x <= 4; x += step) {
            double fx = 3 * x - 4 * Math.sin(x * x);
            if (fx >= start && fx <= end) {
                countInRange++;
            }
        }

        if (countInRange > 0) {
            System.out.println("Кількість значень функції у діапазоні [" + start + ", " + end + "]: " + countInRange);
        } else {
            System.out.println("Значень функції у вказаному діапазоні немає.");
        }

        System.out.println("Ви виконали підтаску 2.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task_5 task = new Task_5(scanner);
        task.run();
        scanner.close();
    }
}
