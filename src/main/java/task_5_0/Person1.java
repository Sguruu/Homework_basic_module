package task_5_0;

public class Person1 {
    String name; // поле класса или свойство класса
    String surname;  // поле класса фамилия
    String middleName;  // отчество
    int age; // возраст

    // поведение (метод представиться)
    public void introduceYourself() {
        System.out.println("Меня зовут " + name + " мое отчество " + middleName + "мой возраст " + age);
    }
}

