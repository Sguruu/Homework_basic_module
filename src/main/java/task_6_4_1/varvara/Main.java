package task_6_4_1.varvara;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        String answer2;
        boolean result;
        String textAdd = " \n1. Добавить контакт";
        String textRemove = "2. Удалить контакт";
        String textEdit = "3. Редактировать контакт";
        String textShow = "4. Посмотреть контакт";
        String textExit = "5. Выйти из программы\n";
        String textError = "Вы ввели неверное значение. Повторите.\n";

        System.out.print("Привет, тебя приветствует записная книжка! ");

        do {
            System.out.print("\nВыбери действие ");
            System.out.print(textAdd + "\n" + textRemove + "\n" + textEdit + "\n" + textShow + "\n" + textExit);
            do {
                answer2 = in.nextLine();
                result = answer2.matches("-?\\d+");

                if (result == false) {
                    System.out.println("Вы ввели текст, когда ожидалось число");
                }

            } while (!result);


            switch (answer2) {
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
                    replay();
                    break;
                default:
                    System.out.print(textError);
            }
        } while (!answer2.equals("5"));
        in.close();
    }

    private static void editListPerson(ArrayList<Person> list) {
        Scanner in = new Scanner(System.in);
        String name, lastName, answer, number;
        int index;
        boolean result = false;

        System.out.print("Введите индекс контакта: ");
        do {

            answer = in.nextLine();
            result = answer.matches("-?\\d+");

            if (result) { // true когда число
                index = Integer.parseInt(answer);

                if (index < list.size() && index >= 0) {
                    name = list.get(index).getName();
                    lastName = list.get(index).getLastName();
                    number = list.get(index).getPhoneNumber();

                    System.out.println("Изменяемый контакт "+name);
                } else {
                    // конец цикла
                    System.out.println("Такого индекса нет !");
                    continue;
                }

            } else {
                // конец цикла
                System.out.println("Вы ввели символ, когда ожидалось число");
                continue;
            }

            System.out.print("Введите имя: ");
            list.get(index).setName(in.nextLine());
            System.out.print("Введите фамилию: ");
            list.get(index).setLastName(in.nextLine());
            System.out.print("Введите номер телефона: ");
            list.get(index).setPhoneNumber(in.nextLine());
            System.out.println("Результат редактирования");
            System.out.print(list.get(index));

        } while (!result);
    }


    private static void addPerson(ArrayList<Person> list) {
        String name, lastName, phoneNumber;
        boolean result;

        System.out.print("Введите имя: ");
        name = in.nextLine();
        System.out.print("Введите фамилию: ");
        lastName = in.nextLine();
        System.out.print("Введите номер телефона: ");
        do {
            phoneNumber = in.nextLine();
            result = phoneNumber.matches("-?\\d+");

            if (result == false) {
                System.out.println("Вы ввели текст, когда ожидалось число");
            }

        } while (!result);

        System.out.print("Добавлен в записную книжку\n");
        phoneNumber = String.valueOf((Long.parseLong(phoneNumber)));
        System.out.print(name + "\n" + lastName + "\n" + phoneNumber);

        list.add(new Person(name, lastName, phoneNumber));
    }


    private static void showListPerson(ArrayList<Person> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(i + " "
                    + list.get(i).getName() + " "
                    + list.get(i).getLastName() + " "
                    + list.get(i).getPhoneNumber() + "\n ");
        }
    }

    public static String replay() {
        System.out.println("Введите Да, чтобы продолжить работу");
        String answer = in.nextLine();
        if (!answer.equals("Да") && !answer.equals("да")) {
            System.out.println("Чтобы подтвердить выход из программы, введите Да");
            answer = in.nextLine();
            if (answer.equals("Да") || answer.equals("да")) {
                return "Нет";
            } else {
                return "Да";
            }
        } else {
            return "Да";
        }
    }

    private static void removePerson(ArrayList<Person> list) {
        String name, lastName, phoneNumber;
        System.out.print("Введите имя, фамилию и номер контакта, которого хотите удалить: ");

        name = in.nextLine();
        lastName = in.nextLine();
        phoneNumber = in.nextLine();

        Person person = new Person(name, lastName, phoneNumber);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(person)) {
                System.out.print("Контакт успешно удален");
                list.remove(i);
            }
        }
    }
}
