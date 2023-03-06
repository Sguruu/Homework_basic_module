package lesson.lesson_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Серга", 23);

        person.hello();
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

     void hello() {
    }

}

