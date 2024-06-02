import java.util.Scanner;

public class Task_2 {
    private Scanner scanner;

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
        System.out.println("\033[1mЗадання 2. Створення класу Phone\033[0m");

        // а) Створення класу Phone
        class Phone {
            private String number;
            private String model;
            private double weight;

            // д) Конструктор, який приймає три параметри
            public Phone(String number, String model, double weight) {
                this.number = number;
                this.model = model;
                this.weight = weight;
            }

            // е) Конструктор, який приймає два параметри
            public Phone(String number, String model) {
                this(number, model, 0);
            }

            // ж) Конструктор без параметрів
            public Phone() {
                this("", "", 0);
            }

            // г) Метод receiveCall
            public void receiveCall(String callerName) {
                System.out.println("Дзвонить " + callerName);
            }

            // з) Перевантажений метод receiveCall з двома параметрами
            public void receiveCall(String callerName, String callerNumber) {
                System.out.println("Дзвонить " + callerName + " з номером " + callerNumber);
            }

            // г) Метод getNumber
            public String getNumber() {
                return number;
            }

            // к) Метод sendMessage з аргументами змінної довжини
            public void sendMessage(String... numbers) {
                System.out.print("Повідомлення буде надіслано на наступні номери: ");
                for (String num : numbers) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }

            // в) Метод для виведення значень змінних на консоль
            public void printInfo() {
                System.out.println("Номер: " + number + ", Модель: " + model + ", Вага: " + weight);
            }
        }

        // б) Створення трьох екземплярів класу Phone
        Phone phone1 = new Phone("123-456-789", "Model A", 150.5);
        Phone phone2 = new Phone("987-654-321", "Model B", 160.0);
        Phone phone3 = new Phone("555-666-777", "Model C");

        // в) Виведення значень змінних на консоль
        phone1.printInfo();
        phone2.printInfo();
        phone3.printInfo();

        // г) Виклик методів receiveCall та getNumber
        phone1.receiveCall("Олександр");
        phone2.receiveCall("Марія");
        phone3.receiveCall("Іван");

        System.out.println("Номер телефону 1: " + phone1.getNumber());
        System.out.println("Номер телефону 2: " + phone2.getNumber());
        System.out.println("Номер телефону 3: " + phone3.getNumber());

        // з) Виклик перевантаженого методу receiveCall
        phone1.receiveCall("Олександр", "123-456-789");
        phone2.receiveCall("Марія", "987-654-321");
        phone3.receiveCall("Іван", "555-666-777");

        // к) Виклик методу sendMessage
        phone1.sendMessage("123-456-789", "987-654-321");
        phone2.sendMessage("555-666-777", "222-333-444", "111-222-333");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task_2 task = new Task_2();
        task.Task(scanner);
    }
}

