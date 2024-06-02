import java.util.Scanner;

abstract class TrigonometricComplexNumber_1 {
    protected double module;
    protected double argument;

    public TrigonometricComplexNumber_1(double module, double argument) {
        this.module = module;
        this.argument = argument;
    }

    public abstract void raiseToPower(int power);

    public void printPolarForm() {
        System.out.println(module + " × [cos(" + argument + ") + i × sin(" + argument + ")]");
    }
}

class ExtendedTrigonometricComplexNumber extends TrigonometricComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public ExtendedTrigonometricComplexNumber(double module, double argument, double realPart, double imaginaryPart) {
        super(module, argument);
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public void raiseToPower(int power) {
        double newModule = Math.pow(module, power);
        double newArgument = argument * power;
        System.out.println("Result: " + newModule + " × [cos(" + newArgument + ") + i × sin(" + newArgument + ")]");
    }

    @Override
    public void printPolarForm() {
        System.out.println("Extended Complex Number:");
        System.out.println("Module: " + module);
        System.out.println("Argument: " + argument);
        System.out.println("Real Part: " + realPart);
        System.out.println("Imaginary Part: " + imaginaryPart);
    }
}

public class Task_6 {
    private Scanner scanner;

    public void Task(Scanner scanner) {
        this.scanner = scanner;
        boolean exitTask = false;

        while (!exitTask) {
            System.out.println(" ");
            System.out.println("\n\033[1mМеню завдання 6:\033[0m");
            System.out.println("1. Виконати завдання");
            System.out.println("2. Повернутися до головного меню");
            System.out.print("Ваш вибір: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    executeTask6();
                    break;
                case "2":
                    exitTask = true;
                    break;
                default:
                    System.out.println("Некоректний ввід.");
            }
        }
    }

    private void executeTask6() {
        boolean exitSubtask = false;

        while (!exitSubtask) {
            System.out.println(" ");
            System.out.println("\n\033[1mМеню створення розширеного комплексного числа:\033[0m");
            System.out.println("1. Створити розширене комплексне число");
            System.out.println("2. Повернутися до попереднього меню");
            System.out.print("Ваш вибір: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    createExtendedComplexNumber();
                    break;
                case "2":
                    exitSubtask = true;
                    break;
                default:
                    System.out.println("Некоректний ввід.");
            }
        }
    }

    private void createExtendedComplexNumber() {
        System.out.println("\033[1mСтворення розширеного комплексного числа\033[0m");
        double module = readDoubleInput("Введіть модуль: ");
        if (Double.isNaN(module)) return;

        double argument = readDoubleInput("Введіть аргумент (кут) в радіанах: ");
        if (Double.isNaN(argument)) return;

        double realPart = readDoubleInput("Введіть дійсну частину: ");
        if (Double.isNaN(realPart)) return;

        double imaginaryPart = readDoubleInput("Введіть уявну частину: ");
        if (Double.isNaN(imaginaryPart)) return;

        ExtendedTrigonometricComplexNumber complexNumber = new ExtendedTrigonometricComplexNumber(module, argument, realPart, imaginaryPart);
        System.out.println("Розширене комплексне число:");
        complexNumber.printPolarForm();
    }

    private double readDoubleInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                return Double.NaN;
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
        Task_6 task = new Task_6();
        task.Task(scanner);
    }
}
