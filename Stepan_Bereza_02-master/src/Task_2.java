import java.util.Scanner;

public class Task_2 {
    public void Task() {
        boolean exitTask = false;

        while (!exitTask) {
            System.out.println(" ");
            System.out.println("\n\033[1mМеню завдання 2:\033[0m");
            System.out.println("1. Виконати завдання");
            System.out.println("2. Повернутися до головного меню");
            System.out.print("Ваш вибір: ");

            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    executeTask2(scanner);
                    break;
                case "2":
                    exitTask = true;
                    break;
                default:
                    System.out.println("Некоректний ввід.");
            }
        }
    }

    private void executeTask2(Scanner scanner) {
        // Виведення заголовка завдання жирним шрифтом
        System.out.println("\n\033[1mЗадання 2. Визначення номера квадранта для точки з координатами\033[0m");
        // Виведення запиту на введення координат точки
        System.out.println("Введіть координати точки (x, y) або 'stop', щоб повернутися до меню:");

        // Перевірка наявності введених даних перед викликом nextLine()
        if (!scanner.hasNextLine()) {
            System.out.println("Введіть координати точки або 'stop'.");
            return;
        }
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("stop")) {
            return;
        }
        double x = Double.parseDouble(input);

        // Перевірка наявності введених даних перед викликом nextLine()
        if (!scanner.hasNextLine()) {
            System.out.println("Введіть координати точки або 'stop'.");
            return;
        }
        input = scanner.nextLine();
        if (input.equalsIgnoreCase("stop")) {
            return;
        }
        double y = Double.parseDouble(input);

        // Перевірка координат та визначення номера квадранта
        if (x > 0 && y > 0) {
            System.out.println("Точка знаходиться в першому квадранті");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка знаходиться в другому квадранті");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка знаходиться в третьому квадранті");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка знаходиться в четвертому квадранті");
        } else if (x == 0 && y != 0) {
            System.out.println("Точка знаходиться на вісі Y");
        } else if (x != 0 && y == 0) {
            System.out.println("Точка знаходиться на вісі X");
        } else {
            System.out.println("Точка знаходиться в початку координат");
        }
    }
}
