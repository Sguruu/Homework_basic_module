package stream.st_6;

import stream.st_6.equals.Person_st_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }


    private static void primer1() {
        Scanner in = new Scanner(System.in);
        String answer;
        boolean result;
        System.out.println("Введите значение");

        do {
            answer = in.nextLine();
            result = answer.matches("-?\\d+");

            if (result == false) {
                System.out.println("Вы ввели текст, когда ожидалось число");
            }

        } while (!result);  // если result = true это значит мы ввели число, если result = false то значит мы ввели текст

        switch (answer) {
            case "1":
                // твой код
                System.out.println("1");
                break;
            case "2":
                // твой код
                System.out.println("2");
                break;
        }
        in.close();
    }


    private static void primer2() {
        Person_st_6 pers1 = new Person_st_6("Валера", 25);
        Person_st_6 pers2 = new Person_st_6("Валера", 25);

        if (pers1.equals(pers2)) {
            System.out.println("Равны");
        } else {
            System.out.println("Не равны");
        }


    }
}

