import java.util.Scanner;

abstract class Shape {
    protected double volume;

    public double getVolume() {
        return volume;
    }
}

abstract class SolidOfRevolution extends Shape {
    protected double radius;

    public SolidOfRevolution(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

class Cylinder extends SolidOfRevolution {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
        this.volume = Math.PI * radius * radius * height;
    }

    public double getHeight() {
        return height;
    }
}

class Ball extends SolidOfRevolution {
    public Ball(double radius) {
        super(radius);
        this.volume = (4 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

class Pyramid extends Shape {
    private double s;
    private double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
        this.volume = (s * h) / 3.0;
    }

    public double getBaseArea() {
        return s;
    }

    public double getHeight() {
        return h;
    }
}

public class Task_3 {
    private Scanner scanner;

    public void Task(Scanner scanner) {
        this.scanner = scanner;
        boolean exitTask = false;

        while (!exitTask) {
            System.out.println(" ");
            System.out.println("\n\033[1mМеню завдання 3:\033[0m");
            System.out.println("1. Виконати завдання");
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
        boolean exitSubtask = false;

        while (!exitSubtask) {
            System.out.println(" ");
            System.out.println("\n\033[1mМеню створення фігури:\033[0m");
            System.out.println("1. Створити циліндр");
            System.out.println("2. Створити кулю");
            System.out.println("3. Створити піраміду");
            System.out.println("4. Повернутися до попереднього меню");
            System.out.print("Ваш вибір: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    createCylinder();
                    break;
                case "2":
                    createBall();
                    break;
                case "3":
                    createPyramid();
                    break;
                case "4":
                    exitSubtask = true;
                    break;
                default:
                    System.out.println("Некоректний ввід.");
            }
        }
    }

    private void createCylinder() {
        System.out.println("\033[1mСтворення циліндра\033[0m");
        Double radius = readDoubleInput("Введіть радіус: ");
        if (radius == null) return;

        Double height = readDoubleInput("Введіть висоту: ");
        if (height == null) return;

        Cylinder cylinder = new Cylinder(radius, height);
        System.out.println("Об'єм циліндра: " + cylinder.getVolume());
    }

    private void createBall() {
        System.out.println("\033[1mСтворення кулі\033[0m");
        Double radius = readDoubleInput("Введіть радіус: ");
        if (radius == null) return;

        Ball ball = new Ball(radius);
        System.out.println("Об'єм кулі: " + ball.getVolume());
    }

    private void createPyramid() {
        System.out.println("\033[1mСтворення піраміди\033[0m");
        Double s = readDoubleInput("Введіть площу основи: ");
        if (s == null) return;

        Double h = readDoubleInput("Введіть висоту: ");
        if (h == null) return;

        Pyramid pyramid = new Pyramid(s, h);
        System.out.println("Об'єм піраміди: " + pyramid.getVolume());
    }

    private Double readDoubleInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                return null;
            }
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Некоректний ввід. Введіть число або 'stop' для виходу.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task_3 task = new Task_3();
        task.Task(scanner);
    }
}
