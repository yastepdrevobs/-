import java.util.Scanner;

abstract class ComplexNumber {
    protected double module;
    protected double argument;

    public ComplexNumber(double module, double argument) {
        this.module = module;
        this.argument = argument;
    }

    public abstract void raiseToPower(int power);

    public void printPolarForm() {
        System.out.println(module + " × [cos(" + argument + ") + i × sin(" + argument + ")]");
    }
}

class TrigonometricComplexNumber extends ComplexNumber {
    public TrigonometricComplexNumber(double module, double argument) {
        super(module, argument);
    }

    @Override
    public void raiseToPower(int power) {
        double newModule = Math.pow(module, power);
        double newArgument = argument * power;
        System.out.println("Result: " + newModule + " × [cos(" + newArgument + ") + i × sin(" + newArgument + ")]");
    }
}

public class Task_5 {
    private Scanner scanner;

    public void Task(Scanner scanner) {
        this.scanner = scanner;
        boolean exitTask = false;

        while (!exitTask) {
            System.out.println(" ");
            System.out.println("\n\033[1mМеню завдання 5:\033[0m");
            System.out.println("1. Виконати завдання");
            System.out.println("2. Повернутися до головного меню");
            System.out.print("Ваш вибір: ");

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

    private void executeTask5() {
        boolean exitSubtask = false;

        while (!exitSubtask) {
            System.out.println(" ");
            System.out.println("\n\033[1mМеню створення комплексного числа:\033[0m");
            System.out.println("1. Введення комплексного числа в тригонометричній формі");
            System.out.println("2. Піднесення комплексного числа в степінь");
            System.out.println("3. Повернутися до попереднього меню");
            System.out.print("Ваш вибір: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    createTrigonometricComplexNumber();
                    break;
                case "2":
                    raiseToPower();
                    break;
                case "3":
                    exitSubtask = true;
                    break;
                default:
                    System.out.println("Некоректний ввід.");
            }
        }
    }

    private void createTrigonometricComplexNumber() {
        System.out.println("\033[1mСтворення комплексного числа в тригонометричній формі\033[0m");
        double module = readDoubleInput("Введіть модуль: ");
        if (Double.isNaN(module)) return;

        double argument = readDoubleInput("Введіть аргумент (кут) в радіанах: ");
        if (Double.isNaN(argument)) return;

        TrigonometricComplexNumber complexNumber = new TrigonometricComplexNumber(module, argument);
        System.out.print("Комплексне число: ");
        complexNumber.printPolarForm();
    }

    private void raiseToPower() {
        System.out.println("\033[1mПіднесення комплексного числа в степінь\033[0m");
        double module = readDoubleInput("Введіть модуль: ");
        if (Double.isNaN(module)) return;

        double argument = readDoubleInput("Введіть аргумент (кут) в радіанах: ");
        if (Double.isNaN(argument)) return;

        int power = readIntegerInput("Введіть степінь: ");
        if (power == Integer.MIN_VALUE) return;

        TrigonometricComplexNumber complexNumber = new TrigonometricComplexNumber(module, argument);
        complexNumber.raiseToPower(power);
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

    private int readIntegerInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                return Integer.MIN_VALUE;
            }
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Некоректний ввід. Введіть ціле число або 'stop' для виходу.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task_5 task = new Task_5();
        task.Task(scanner);
    }
}
