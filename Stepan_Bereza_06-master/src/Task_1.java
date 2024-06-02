import java.util.Scanner;

public class Task_1 {
    private Scanner scanner;

    public void Task(Scanner scanner) {
        this.scanner = scanner;
        boolean exitTask = false;

        while (!exitTask) {
            System.out.println("\n\033[1mМеню завдання 1:\033[0m");
            System.out.println("1. Створити об'єкт Person за допомогою конструктора без параметрів");
            System.out.println("2. Створити об'єкт Person за допомогою конструктора з параметрами");
            System.out.println("3. Повернутися до головного меню");
            System.out.print("Ваш вибір: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    createPersonWithoutParams();
                    break;
                case "2":
                    createPersonWithParams();
                    break;
                case "3":
                    exitTask = true;
                    break;
                default:
                    System.out.println("Некоректний ввід.");
            }
        }
    }

    private void createPersonWithoutParams() {
        System.out.println("\033[1mСтворення об'єкта Person за допомогою конструктора без параметрів\033[0m");
        Person person = new Person();
        person.move();
        person.talk();
    }

    private void createPersonWithParams() {
        System.out.println("\033[1mСтворення об'єкта Person за допомогою конструктора з параметрами\033[0m");
        System.out.print("Введіть повне ім'я (або 'stop' для виходу): ");
        String fullName = scanner.nextLine();
        if (fullName.equalsIgnoreCase("stop")) return;

        System.out.print("Введіть вік (або 'stop' для виходу): ");
        int age = readInt();
        if (age == -1) return;

        Person person = new Person(fullName, age);
        person.move();
        person.talk();
    }

    private int readInt() {
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("stop")) return -1;
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Некоректний ввід. Введіть ціле число або 'stop' для виходу.");
            return readInt();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task_1 task = new Task_1();
        task.Task(scanner);
        scanner.close();
    }
}
