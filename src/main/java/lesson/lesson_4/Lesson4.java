package lesson.lesson_4;

public class Lesson4 {
    public static void main(String[] args) {
        hello("Олег", "Виталя");
        hello("Кристина", "Александра");
        hello("Сережа");
        hello();
    }

    public static void hello(String name1, String name2) {
        System.out.println("Привет " + name1);
        System.out.println("Привет " + name2);
    }

    public static void hello(String name1) {
        System.out.println("Привет " + name1);
    }

    public static void hello() {
        System.out.println("Привет мир!");
    }
}
