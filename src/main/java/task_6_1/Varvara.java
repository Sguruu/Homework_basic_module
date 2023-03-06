import java.util.ArrayList;
import java.util.Scanner;

public class Varvara {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>(5);

        System.out.println("Введите строки для проверки");

        for (int i = 0; i < 5; i++) {
            System.out.println("Строка № " + i);
            String line = in.nextLine();
            list.add(line);
        }

        int minString = list.get(0).length(); //1

        for (int i = 0; i < list.size(); i++) {
            if (minString > list.get(i).length()) { //достает i элемент и узнает длину
                minString = list.get(i).length();
            }
        }

        System.out.println("Самая короткая строка (строки): \n");

        for (int i = 0; i < list.size(); i++) {
            if (minString == list.get(i).length()) {
                System.out.println(list.get(i));
                System.out.print(" Ее длина : " + list.get(i).length());
            }
        }


    }
}