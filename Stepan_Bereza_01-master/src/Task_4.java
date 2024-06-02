import java.util.Scanner;
public class Task_4 { // Оголошення класу Task_4
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
    private void executeTask4 () {
        // Створення об'єктів типу Car для 10 автомобілів з різними характеристиками
        Car car1 = new Car(200, 2.0, "Toyota", "Camry", "Black", 2022, "Sedan");
        Car car2 = new Car(180, 1.8, "Honda", "Civic", "Silver", 2023, "Hatchback");
        Car car3 = new Car(250, 3.0, "BMW", "X5", "White", 2021, "SUV");
        Car car4 = new Car(150, 1.6, "Ford", "Focus", "Blue", 2020, "Compact");
        Car car5 = new Car(300, 2.5, "Mercedes", "E-Class", "Red", 2022, "Luxury");
        Car car6 = new Car(220, 2.2, "Audi", "A4", "Gray", 2024, "Sedan");
        Car car7 = new Car(190, 1.9, "Volkswagen", "Golf", "Green", 2023, "Hatchback");
        Car car8 = new Car(270, 2.8, "Lexus", "RX", "Black", 2021, "SUV");
        Car car9 = new Car(210, 2.1, "Hyundai", "Sonata", "Silver", 2022, "Sedan");
        Car car10 = new Car(280, 3.5, "Porsche", "911", "Yellow", 2020, "Sports");

        // Обчислення загального об'єму двигуна та потужності для всіх автомобілів
        double totalEngineVolume = car1.getEngineVolume() + car2.getEngineVolume() + car3.getEngineVolume() +
                car4.getEngineVolume() + car5.getEngineVolume() + car6.getEngineVolume() + car7.getEngineVolume() +
                car8.getEngineVolume() + car9.getEngineVolume() + car10.getEngineVolume();

        int totalHorsepower = car1.getHorsepower() + car2.getHorsepower() + car3.getHorsepower() +
                car4.getHorsepower() + car5.getHorsepower() + car6.getHorsepower() + car7.getHorsepower() +
                car8.getHorsepower() + car9.getHorsepower() + car10.getHorsepower();

        // Виведення заголовка завдання жирним шрифтом
        System.out.println("\n\033[1mЗавдання 4. Операції з класом Car\033[0m");
        // Виведення результатів на консоль
        System.out.println("Загальний об'єм двигуна: " + totalEngineVolume);
        System.out.println("Загальна потужність: " + totalHorsepower);

    }
}
class Car { // Клас, що представляє автомобіль

    // Приватні поля класу
    private final int horsepower;
    private final double engineVolume;
    private final String make;
    private final String model;
    private final String color;
    private final int year;
    private final String type;

    // Конструктор класу
    public Car(int horsepower, double engineVolume, String make, String model, String color, int year, String type) {
        this.horsepower = horsepower;
        this.engineVolume = engineVolume;
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.type = type;
    }

    // Методи доступу до полів класу
    public int getHorsepower() {
        return horsepower;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getType() {
        return type;
    }
}
