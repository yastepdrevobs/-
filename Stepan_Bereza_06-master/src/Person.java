public class Person {
    private String fullName;
    private int age;

    // Конструктор без параметрів
    public Person() {
        this.fullName = "Unknown";
        this.age = 0;
    }

    // Конструктор з параметрами
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " is moving.");
    }

    public void talk() {
        System.out.println(fullName + " is talking.");
    }

    public static void main(String[] args) {
        // Створення об'єкта Person за допомогою конструктора без параметрів
        Person person1 = new Person();

        // Виклик методів для об'єкта person1
        person1.move();
        person1.talk();

        // Створення об'єкта Person за допомогою конструктора з параметрами
        Person person2 = new Person("John Doe", 30);

        // Виклик методів для об'єкта person2
        person2.move();
        person2.talk();
    }
}
