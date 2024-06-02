import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Driver {
    private String name;
    private int age;
    private int drivingExperience;

    public Driver(String name, int age, int drivingExperience) {
        this.name = name;
        this.age = age;
        this.drivingExperience = drivingExperience;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String toString() {
        return name + ", " + age + " років, стаж: " + drivingExperience + " років";
    }
}

class Car {
    private String brand;
    private double enginePower;
    private Driver driver;
    private double price;
    private int year;

    public Car(String brand, double enginePower, Driver driver, double price, int year) {
        this.brand = brand;
        this.enginePower = enginePower;
        this.driver = driver;
        this.price = price;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Марка: " + brand + ", Потужність двигуна: " + enginePower + " к.с., Водій: " + driver + ", Ціна: " + price + ", Рік випуску: " + year;
    }
}

class Helper {
    public static void chooseRandomCar(List<Car> cars) {
        Random random = new Random();
        Car car = cars.get(random.nextInt(cars.size()));
        System.out.println("Автомобіль марки " + car.getBrand() + " з водієм " + car.getDriver().getName() + " виїхав за вами");
        arriveAtDestination(car);
    }

    public static void arriveAtDestination(Car car) {
        System.out.println("Водій " + car.getDriver().getName() + " прибув на місце");
    }
}

public class Task_1 {
    private Scanner scanner;

    public void Task(Scanner scanner) {
        this.scanner = scanner;
        boolean exitTask = false;

        while (!exitTask) {
            System.out.println(" ");
            System.out.println("\n\033[1mМеню завдання 1:\033[0m");
            System.out.println("1. Виконати завдання");
            System.out.println("2. Повернутися до головного меню");
            System.out.print("Ваш вибір: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    executeTask1();
                    break;
                case "2":
                    exitTask = true;
                    break;
                default:
                    System.out.println("Некоректний ввід.");
            }
        }
    }

    private void executeTask1() {
        List<Car> cars = new ArrayList<>();

        // Створення 10-20 машин
        cars.add(new Car("Toyota", 150, new Driver("Іван", 30, 10), 20000, 2018));
        cars.add(new Car("Honda", 130, new Driver("Петро", 25, 5), 18000, 2019));
        cars.add(new Car("Ford", 170, new Driver("Олексій", 35, 15), 25000, 2016));
        cars.add(new Car("BMW", 200, new Driver("Володимир", 40, 20), 35000, 2015));
        cars.add(new Car("Audi", 190, new Driver("Максим", 28, 7), 30000, 2017));
        cars.add(new Car("Mercedes", 210, new Driver("Сергій", 45, 25), 40000, 2014));
        cars.add(new Car("Nissan", 160, new Driver("Дмитро", 32, 12), 22000, 2018));
        cars.add(new Car("Chevrolet", 140, new Driver("Олег", 29, 6), 19000, 2020));
        cars.add(new Car("Volkswagen", 180, new Driver("Юрій", 33, 8), 27000, 2017));
        cars.add(new Car("Hyundai", 150, new Driver("Василь", 27, 4), 20000, 2019));
        cars.add(new Car("Kia", 170, new Driver("Андрій", 26, 3), 21000, 2020));
        cars.add(new Car("Mazda", 175, new Driver("Олександр", 31, 9), 23000, 2018));

        // Ремонт мотору для половини автопарку
        for (int i = 0; i < cars.size() / 2; i++) {
            Car car = cars.get(i);
            car.setEnginePower(car.getEnginePower() * 1.1);
            car.setDriver(new Driver("Новий водій " + (i + 1), 30, 10));
        }

        // Підвищення потужності та ціни для кожної другої машини
        for (int i = 1; i < cars.size(); i += 2) {
            Car car = cars.get(i);
            car.setEnginePower(car.getEnginePower() * 1.1);
            car.setPrice(car.getPrice() * 1.05);
        }

        // Перевірка досвіду всіх водіїв
        for (Car car : cars) {
            Driver driver = car.getDriver();
            if (driver.getDrivingExperience() < 5 && driver.getAge() > 25) {
                driver.setDrivingExperience(driver.getDrivingExperience() + 1);
            }
        }

        // Використання Helper класу
        Helper.chooseRandomCar(cars);
    }
}
