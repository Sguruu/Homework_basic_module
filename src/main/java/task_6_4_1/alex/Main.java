package task_6_4_1.alex;



import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {


        Person person1 = new Person("1","1","1");
        Person person2 = new Person("1","1","1");

        if (person1.equals(person2)){
            System.out.println("1");
        } else {
            System.out.println("2");
        }

        String answer;
        ArrayList<Person> list = new ArrayList<>();
        String textAdd = "1. Добавить контакт";
        String textRemove = "2. Удалить контакт";
        String textEdit = "3. Редактировать контакт";
        String textShow = "4. Просмотреть контакт";
        String textExit = "5. Выход из программы";
        String textError = "Вы вводите неверное значение, поробуйте ещё раз!";


        System.out.println("Вас приветствует программа Записная книжка, выберите нужные действия: ");

        do {
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
                    editlistPerson(list);
                    break;
                case "4":
                    showlistPerson(list);
                    break;
                default:
                    System.out.println(textError);
            }

        } while (!answer.equals("5"));

        in.close();
    }

    private static void addPerson(ArrayList<Person> list) {
        String name, lastName, numberPhone;
        System.out.println("Введите ИМЯ нового контакта");
        name = in.nextLine();
        System.out.println("Введите ФАМИЛИЮ нового контакта");
        lastName = in.nextLine();
        System.out.println("Введите НОМЕР ТЕЛЕФОНА нового контакта");
        numberPhone = in.nextLine();
        System.out.println("Добавлен в записную книжку");
        System.out.println(name + "\n" + lastName + "\n" + numberPhone);

        list.add(new Person(name, lastName, numberPhone));
    }

    private static void removePerson(ArrayList<Person> list) {
        String name, lastName, numberPhone;
        System.out.println("Введите ИМЯ, ФАМИЛИЮ и НОМЕР ТЕЛЕФОНА который нужно удалить");
        name = in.nextLine();
        lastName = in.nextLine();
        numberPhone = in.nextLine();
        System.out.println("Ненужный контакт успешно удалён");

        list.remove(new Person(name, lastName, numberPhone));
    }

    private static void showlistPerson(ArrayList<Person> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " " + list.get(i).getName() + " " + list.get(i).getLastName() + " " + list.get(i).getNumberPhone());
        }
    }
    private static void editlistPerson (ArrayList<Person> list) {

        }
    }
