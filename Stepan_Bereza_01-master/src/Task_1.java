import java.util.Scanner;
public class Task_1 { // Оголошення класу Task_1
    public void Task() { // Оголошення методу Task() для виконання завдання

        boolean exitTask = false;

        while (!exitTask) {
            System.out.println(" ");
            System.out.println("\n\033[1mМеню завдання 1:\033[0m");
            System.out.println("1. Виконати завдання");
            System.out.println("2. Повернутися до головного меню");
            System.out.print("Ваш вибір: ");

            Scanner scanner = new Scanner(System.in);
            ;
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    executeTask1();
                    break;
                case "2":
                    exitTask = true;
                    break;
                default:
                    System.out.println("Некоректний ввід.");
            }
        }
    }
    private void executeTask1 () {
        // Оголошення та ініціалізація десяти цілих чисел
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;
        int num6 = 6;
        int num7 = 7;
        int num8 = 8;
        int num9 = 9;
        int num10 = 10;

        // Обчислення суми чисел
        int sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
        // Обчислення різниці чисел
        int difference = num1 - num2 - num3 - num4 - num5 - num6 - num7 - num8 - num9 - num10;
        // Обчислення добутку чисел
        int product = num1 * num2 * num3 * num4 * num5 * num6 * num7 * num8 * num9 * num10;
        // Обчислення частки чисел (з перетворенням на double, щоб отримати дробовий результат)
        double quotient = (double) num1 / num2 / num3 / num4 / num5 / num6 / num7 / num8 / num9 / num10;

        // Виведення заголовка завдання жирним шрифтом
        System.out.println("\n\033[1mЗавдання 1. Арифметичні операції\033[0m");
        // Виведення результатів арифметичних операцій на консоль
        System.out.println("Сума: " + sum);
        System.out.println("Різниця: " + difference);
        System.out.println("Добуток: " + product);
        System.out.println("Частка: " + quotient);
    }
}
