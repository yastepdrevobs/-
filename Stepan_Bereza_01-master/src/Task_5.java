import java.util.Scanner;
public class Task_5 { // Оголошення класу Task_5
    public void Task() { // Оголошення методу Task() для виконання завдання

        boolean exitTask = false;

        while (!exitTask) {
            System.out.println(" ");
            System.out.println("\n\033[1mМеню завдання 2:\033[0m");
            System.out.println("1. Виконати завдання");
            System.out.println("2. Повернутися до головного меню");
            System.out.print("Ваш вибір: ");

            Scanner scanner = new Scanner(System.in);;
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    executeTask5();
                    break;
                case "2":
                    exitTask = true;
                    break;
                default:
                    System.out.println("Некоректний ввід.");
            }
        }
    }
    private void executeTask5 () {

        int number = 246; // Початкове число
        int reverse = 0; // Змінна для зберігання реверсованого числа

        while(number != 0) {  // Цикл, який виконується, доки число number не стає рівним 0
            int remainder = number % 10; // Знаходження остачі від ділення на 10 (остання цифра числа)
            reverse = reverse * 10 + remainder; // Додавання отриманої цифри до реверсованого числа
            number = number / 10; // Видалення останньої цифри з числа number
        }

        // Виведення заголовка завдання жирним шрифтом
        System.out.println("\n\033[1mЗавдання 5. Реверс числа\033[0m");
        // Виведення реверсованого числа на консоль
        System.out.println("Реверснуте число: " + reverse);
    }
}
