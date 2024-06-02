import java.util.Scanner;

public class Task_3 { // Оголошення класу Task_3
    private Scanner scanner;

    public void Task(Scanner scanner) { // Оголошення методу Task() для виконання завдання
        this.scanner = scanner;
        boolean exitTask = false;

        while (!exitTask) {
            System.out.println("\n\033[1mМеню завдання 3:\033[0m");
            System.out.println("1. Вивести інформацію на консоль за допомогою циклу while");
            System.out.println("2. Повернутися до головного меню");
            System.out.print("Ваш вибір: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    executeTask3();
                    break;
                case "2":
                    exitTask = true;
                    break;
                default:
                    System.out.println("Некоректний ввід.");
            }
        }
    }

    private void executeTask3() {
        System.out.println("\n\033[1mЗавдання 3. Виведення інформації на консоль за допомогою циклу while\033[0m");
        int hours = 0; // Ініціалізація змінної годин
        int minutes = 0; // Ініціалізація змінної хвилин

        // Цикл while для виведення інформації про години та хвилини
        while (hours < 3) {  // Поки години менше за 3
            while (minutes < 60) { // Поки хвилини менше за 60
                // Виведення на консоль інформації про години та хвилини
                System.out.println(hours + " год " + minutes + " хв");
                minutes++; // Інкрементуємо значення змінної хвилин
            }
            hours++; // Інкрементуємо значення змінної годин
            minutes = 0; // Скидаємо значення змінної хвилин до початкового значення 0
        }
    }
}
