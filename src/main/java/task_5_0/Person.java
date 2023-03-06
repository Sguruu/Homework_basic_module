package task_5_0;

public class Person {
    private String name; // поле класса или свойство класса
    private String surname;  // поле класса фамилия
    private String middleName;  // отчество
    private int age; // возраст

    public static final double PI = 3.14;

    private static boolean init = false;

    private static String nameOne;

    static {
        if (init == true) {
            System.out.println("Первый " + nameOne);
        }
        init = true;
    }

    public Person(String name) {
        this.name = name;
        if (init == false) {
            nameOne = this.name;
            init = true;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // поведение (метод представиться)
    private void introduceYourself() {
        System.out.println("Меня зовут " + name + " мое отчество " + middleName + "мой возраст " + age);
    }
}

