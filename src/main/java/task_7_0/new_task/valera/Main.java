package task_7_0.new_task.valera;

import task_7_0.new_task.valera.freelancer.Artist;
import task_7_0.new_task.valera.freelancer.Photographer;
import task_7_0.new_task.valera.human.Sex;
import task_7_0.new_task.valera.workerCustom.Accountant;
import task_7_0.new_task.valera.workerCustom.Builder;
import task_7_0.new_task.valera.workerCustom.Plumber;

public class Main {
    public static void main(String[] args) {
        Businessman businessman = new Businessman("Иван", "Петров", (byte) 25, Sex.MAN, "промышленность", BusinessSize.MEDIUM);
        businessman.introduceYourself();
        businessman.doBusiness();

        System.out.println(" ");

        Builder builder = new Builder("Боб", "Строитель", (byte) 25, Sex.MAN, Experience.EXPERIENCED, 30_000);
        builder.introduceYourself();
        builder.build();

        System.out.println(" ");

        Plumber plumber = new Plumber("Андрей", "Сохатый", (byte) 18, Sex.MAN, Experience.BEGINNER, 10_000);
        plumber.introduceYourself();
        plumber.pipesFix();

        System.out.println(" ");

        Accountant accountant = new Accountant("Марья", "Василесова", (byte) 45, Sex.WOMAN, Experience.MASTER, 50_000);
        accountant.introduceYourself();
        accountant.count();

        System.out.println(" ");

        Photographer photographer = new Photographer("Анна", "Старкова", (byte) 13, Sex.WOMAN, Portfolio.MEAGER, 100);
        photographer.introduceYourself();
        photographer.makePhotos();

        System.out.println(" ");

        Artist artist = new Artist("Виолетта", "Файзуллина", (byte) 20, Sex.WOMAN, Portfolio.RICH, 300);
        artist.introduceYourself();
        artist.paint();
    }
}