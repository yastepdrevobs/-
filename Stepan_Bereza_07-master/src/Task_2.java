import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_2 {
    private Scanner scanner;
    private HashMap<String, String> phoneBook;

    public Task_2() {
        phoneBook = new HashMap<>();
        phoneBook.put("Аврамишин", "123-456-789");
        phoneBook.put("Тимків", "234-567-890");
        phoneBook.put("Тишківський", "345-678-901");
        phoneBook.put("Рошко", "456-789-012");
        phoneBook.put("Гурмач", "567-890-123");
        phoneBook.put("Бобенчик", "678-901-234");
        phoneBook.put("Буцяк", "789-012-345");
        phoneBook.put("Щоголев", "890-123-456");
        phoneBook.put("Лужанський", "901-234-567");
        phoneBook.put("Писанюк", "012-345-678");
    }

    public void Task(Scanner scanner) {
        this.scanner = scanner;
        boolean exitTask = false;

        while (!exitTask) {
            System.out.println(" ");
            System.out.println("\n\033[1mМеню завдання 2:\033[0m");
            System.out.println("1. Виконати завдання");
            System.out.println("2. Повернутися до головного меню");
            System.out.print("Ваш вибір: ");

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

    private void executeTask2() {
        boolean exitSubTask = false;

        while (!exitSubTask) {
            System.out.println(" ");
            System.out.println("\n\033[1mОперації з телефонною книгою:\033[0m");
            System.out.println("1. Додати запис (put)");
            System.out.println("2. Знайти номер за прізвищем (get)");
            System.out.println("3. Видалити запис (remove)");
            System.out.println("4. Перевірити наявність прізвища (containsKey)");
            System.out.println("5. Перевірити наявність номера (containsValue)");
            System.out.println("6. Показати розмір телефонної книги (size)");
            System.out.println("7. Показати всі записи");
            System.out.println("8. Повернутися до меню завдання 2");
            System.out.print("Ваш вибір: ");

            String operationChoice = scanner.nextLine();
            switch (operationChoice) {
                case "1":
                    addEntry();
                    break;
                case "2":
                    getPhoneNumber();
                    break;
                case "3":
                    removeEntry();
                    break;
                case "4":
                    checkSurname();
                    break;
                case "5":
                    checkPhoneNumber();
                    break;
                case "6":
                    showSize();
                    break;
                case "7":
                    showAllEntries();
                    break;
                case "8":
                    exitSubTask = true;
                    break;
                default:
                    System.out.println("Некоректний ввід.");
            }
        }
    }

    private void addEntry() {
        System.out.print("Введіть прізвище: ");
        String surname = scanner.nextLine();
        if (surname.equalsIgnoreCase("stop")) {
            return; // Перервати введення
        }
        System.out.print("Введіть номер телефону: ");
        String phoneNumber = scanner.nextLine();
        if (phoneNumber.equalsIgnoreCase("stop")) {
            return; // Перервати введення
        }
        phoneBook.put(surname, phoneNumber);
        System.out.println("Запис додано.");
    }

    private void getPhoneNumber() {
        System.out.print("Введіть прізвище для пошуку: ");
        String surname = scanner.nextLine();
        if (surname.equalsIgnoreCase("stop")) {
            return; // Перервати введення
        }
        if (phoneBook.containsKey(surname)) {
            System.out.println("Номер телефону: " + phoneBook.get(surname));
        } else {
            System.out.println("У книзі відсутній такий абонент.");
        }
    }

    private void removeEntry() {
        System.out.print("Введіть прізвище для видалення: ");
        String surname = scanner.nextLine();
        if (surname.equalsIgnoreCase("stop")) {
            return; // Перервати введення
        }
        if (phoneBook.remove(surname) != null) {
            System.out.println("Запис видалено.");
        } else {
            System.out.println("У книзі відсутній такий абонент.");
        }
    }

    private void checkSurname() {
        System.out.print("Введіть прізвище для перевірки: ");
        String surname = scanner.nextLine();
        if (surname.equalsIgnoreCase("stop")) {
            return; // Перервати введення
        }
        if (phoneBook.containsKey(surname)) {
            System.out.println("Прізвище знайдено в книзі.");
        } else {
            System.out.println("Прізвище не знайдено.");
        }
    }

    private void checkPhoneNumber() {
        System.out.print("Введіть номер телефону для перевірки: ");
        String phoneNumber = scanner.nextLine();
        if (phoneNumber.equalsIgnoreCase("stop")) {
            return; // Перервати введення
        }
        if (phoneBook.containsValue(phoneNumber)) {
            System.out.println("Номер телефону знайдено в книзі.");
        } else {
            System.out.println("Номер телефону не знайдено.");
        }
    }

    private void showSize() {
        System.out.println("Розмір телефонної книги: " + phoneBook.size() + " записів.");
    }

    private void showAllEntries() {
        System.out.println("Усі записи телефонної книги:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println("Прізвище: " + entry.getKey() + ", Номер телефону: " + entry.getValue());
        }
    }
}
