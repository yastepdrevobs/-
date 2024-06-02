import java.util.Scanner;
public class Task_2 { // Оголошення класу Task_2
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
                    executeTask2();
                    break;
                case "2":
                    exitTask = true;
                    break;
                default:
                    System.out.println("Некоректний ввід.");
            }
        }
    }
    private void executeTask2 () {
        // Оголошення та ініціалізація рядків
        String word1 = "Для";
        String word2 = "створення";
        String word3 = "потоку";
        String word4 = "виводу";
        String word5 = "в";
        String word6 = "клас";
        String word7 = "System";
        String word8 = "визначено";
        String word9 = "об'єкт";
        String word10 = "out";

        // Виведення заголовка завдання жирним шрифтом
        System.out.println("\n\033[1mЗавдання 2. Виведення речення через змінні\033[0m");
        // Виведення рядка, складеного зі змінних, на консоль
        System.out.println(word1 + " " + word2 + " " + word3 + " " + word4 + " " + word5 + " " + word6 + " " + word7 + " " + word8 + " " + word9 + " " + word10);
    }
}
