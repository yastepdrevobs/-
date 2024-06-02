import java.util.Scanner;

abstract class Car {
    protected String model;
    protected String color;
    protected int maxSpeed;

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void gas() {
        System.out.println("Газуємо!");
    }

    public abstract void brake();
}

class Sedan extends Car {
    public Sedan(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public void brake() {
        System.out.println("Седан гальмує!");
    }
}

class Truck extends Car {
    public Truck(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public void brake() {
        System.out.println("Грузовик гальмує!");
    }
}

public class Task_4 {
    private Scanner scanner;

    public void Task(Scanner scanner) {
        this.scanner = scanner;
        boolean exitTask = false;

        while (!exitTask) {
            System.out.println(" ");
            System.out.println("\n\033[1mМеню завдання 4:\033[0m");
            System.out.println("1. Виконати завдання");
            System.out.println("2. Повернутися до головного меню");
            System.out.print("Ваш вибір: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    executeTask4();
                    break;
                case "2":
                    exitTask = true;
                    break;
                default:
                    System.out.println("Некоректний ввід.");
            }
        }
    }

    private void executeTask4() {
        boolean exitSubtask = false;

        while (!exitSubtask) {
            System.out.println(" ");
            System.out.println("\n\033[1mМеню створення автомобіля:\033[0m");
            System.out.println("1. Створити Седан");
            System.out.println("2. Створити Грузовик");
            System.out.println("3. Повернутися до попереднього меню");
            System.out.print("Ваш вибір: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    createSedan();
                    break;
                case "2":
                    createTruck();
                    break;
                case "3":
                    exitSubtask = true;
                    break;
                default:
                    System.out.println("Некоректний ввід.");
            }
        }
    }

    private void createSedan() {
        System.out.println("\033[1mСтворення Седана\033[0m");
        String model = readStringInput("Введіть модель: ");
        if (model == null) return;

        String color = readStringInput("Введіть колір: ");
        if (color == null) return;

        Integer maxSpeed = readIntegerInput("Введіть максимальну швидкість: ");
        if (maxSpeed == null) return;

        Sedan sedan = new Sedan(model, color, maxSpeed);
        sedan.gas();
        sedan.brake();
    }

    private void createTruck() {
        System.out.println("\033[1mСтворення Грузовика\033[0m");
        String model = readStringInput("Введіть модель: ");
        if (model == null) return;

        String color = readStringInput("Введіть колір: ");
        if (color == null) return;

        Integer maxSpeed = readIntegerInput("Введіть максимальну швидкість: ");
        if (maxSpeed == null) return;

        Truck truck = new Truck(model, color, maxSpeed);
        truck.gas();
        truck.brake();
    }

    private String readStringInput(String prompt) {
        System.out.print(prompt);
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("stop")) {
            return null;
        }
        return input;
    }

    private Integer readIntegerInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                return null;
            }
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Некоректний ввід. Введіть число або 'stop' для виходу.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task_4 task = new Task_4();
        task.Task(scanner);
    }
}
