import java.util.Scanner;
public class Task_3 { // Оголошення класу Task_3
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
    private void executeTask3 () {

        // Створення об'єктів типу User для 10 користувачів з різними характеристиками
        User user1 = new User(1, 25, "Іван", "Петров", 70.5, 175.2);
        User user2 = new User(2, 30, "Марія", "Іванова", 65.3, 160.7);
        User user3 = new User(3, 28, "Олександр", "Сидоров", 80.0, 180.5);
        User user4 = new User(4, 35, "Анна", "Коваль", 55.8, 165.9);
        User user5 = new User(5, 22, "Петро", "Кузьмін", 90.2, 190.0);
        User user6 = new User(6, 27, "Олена", "Семенова", 63.7, 155.4);
        User user7 = new User(7, 32, "Андрій", "Морозов", 75.1, 170.8);
        User user8 = new User(8, 29, "Ірина", "Павлова", 68.4, 168.3);
        User user9 = new User(9, 26, "Дмитро", "Федоров", 72.9, 177.6);
        User user10 = new User(10, 31, "Ольга", "Лисенко", 58.6, 160.0);

        // Обчислення загального віку, ваги і зросту для всіх користувачів
        int totalAge = user1.getAge() + user2.getAge() + user3.getAge() + user4.getAge() + user5.getAge() +
                user6.getAge() + user7.getAge() + user8.getAge() + user9.getAge() + user10.getAge();

        double totalWeight = user1.getWeight() + user2.getWeight() + user3.getWeight() + user4.getWeight() + user5.getWeight() +
                user6.getWeight() + user7.getWeight() + user8.getWeight() + user9.getWeight() + user10.getWeight();

        double totalHeight = user1.getHeight() + user2.getHeight() + user3.getHeight() + user4.getHeight() + user5.getHeight() +
                user6.getHeight() + user7.getHeight() + user8.getHeight() + user9.getHeight() + user10.getHeight();

        // Виведення заголовка завдання жирним шрифтом
        System.out.println("\n\033[1mЗавдання 3. Операції з класом User\033[0m");
        // Виведення результатів на консоль
        System.out.println("Загальний вік: " + totalAge);
        System.out.println("Загальна вага: " + totalWeight);
        System.out.println("Загальний зріст: " + totalHeight);
    }
}

class User { // Клас, що представляє користувача

    // Приватні поля класу
    private final int id;
    private final int age;
    private final String name;
    private final String surname;
    private final double weight;
    private final double height;

    // Конструктор класу
    public User(int id, int age, String name, String surname, double weight, double height) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.height = height;
    }

    // Методи доступу до полів класу
    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}

