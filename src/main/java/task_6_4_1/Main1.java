package task_6_4_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String answer;
        ArrayList<Person> list = new ArrayList<>();
        String textAdd = "1. Добавить контакт";
        String textRemove = "2. Удалить контакт";
        String textEdit = "3. Редактировать контакт";
        String textShow = "4. Просмотреть контакт";
        String textExit = "5. Выйти из программы";
        String textError = "Вы ввели не верное значение, повторите ввод";

        System.out.println("Привет тебя приветствует программа  записная книжка");

        do {
            System.out.println("Выбери действие");
            System.out.println(textAdd + "\n" + textRemove + "\n" + textEdit + "\n" + textShow + "\n" + textExit);
            answer = in.nextLine();

            switch (answer) {

                case "1":
                    addPerson(list);
                    break;
                case "2":
                    removePerson(list);
                    break;
                case "3":
                    editListPerson(list);
                    break;
                case "4":
                    showListPerson(list);
                    break;
                case "5":
                    break;
                default:
                    System.out.println(textError);
            }

        } while (!answer.equals("5"));

        in.close();
    }

    private static void addPerson(ArrayList<Person> list) {
        String name, lastName, numberPhone;

        System.out.println("Введите Имя контакта");
        name = in.nextLine();
        System.out.println("Введите Фамилию контакта");
        lastName = in.nextLine();
        System.out.println("Введите Номер телефона контакта");
        numberPhone = in.nextLine();
        System.out.println("Добавлен в записную книжку");
        System.out.println(name + "\n" + lastName + "\n" + numberPhone);

        list.add(new Person(name, lastName, numberPhone));
    }

    private static void removePerson(ArrayList<Person> list) {
        String name, lastName, numberPhone;
        System.out.println("Введите Имя, Фамилию и номер контакта которого хотите удалить");

        name = in.nextLine();
        lastName = in.nextLine();
        numberPhone = in.nextLine();

        Person person = new Person(name, lastName, numberPhone);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(person)) {
                list.remove(i);
            }
        }

    }

    private static void editListPerson(ArrayList<Person> list) {
        Scanner inInt = new Scanner(System.in);
        int answer;
        Person person;
        System.out.println("Введите индекс контакта");
        answer = inInt.nextInt();
        person = list.get(answer);

        System.out.println(person.getName() + " " + person.getLastName() + " " + person.getNumberPhone());

        System.out.println("Введите Имя контакта");
        list.get(answer).setName(in.nextLine());
        System.out.println("Введите Фамилию контакта");
        list.get(answer).setLastName(in.nextLine());
        System.out.println("Введите Номер телефона контакта");
        list.get(answer).setNumberPhone(in.nextLine());
    }

    private static void showListPerson(ArrayList<Person> list) {
        Person person;
        for (int i = 0; i < list.size(); i++) {
            person = list.get(i);
            System.out.println(i + " "
                    + person.getName() + " "
                    + person.getLastName() + " "
                    + person.getNumberPhone());
        }
    }
}
