package task_7_0.new_task.varvara;
public class Main {
    public static void main(String[] args) {
        Entrepreneur entrepreneur = new Entrepreneur("Петр", "Максимов", Gender.MAN, 35,"Предприниматель" , BusinessSize.MEDIUM);
        entrepreneur.hello();
        entrepreneur.doBusiness();


        System.out.println(" ");

        Builder builder = new Builder("Матвей", "Ивонин", 49, Gender.MAN, WorkExperience.NEWBIE, 30_000);
        builder.hello();
        builder.build();

        System.out.println(" ");

        Plumber plumber = new Plumber("Елисей", "Александров", 18, Gender.MAN, WorkExperience.EXPERIENCED, 20_000);
        plumber.hello();
        plumber.repairPipes();

        System.out.println(" ");

        Accountant accountant = new Accountant("Никонора", "Петровна", 66, Gender.WOMAN, WorkExperience.MASTER, 50_000);
        accountant.hello();
        accountant.makeCalculations();

        System.out.println(" ");

        Photographer photographer = new Photographer("Анна", "Старкова", Gender.WOMAN, 25,  Portfolio.MEAGER, 100);
        photographer.hello();
        photographer.takePhotos();

        System.out.println(" ");

        Painter painter = new Painter("Оскарида", "Лейн",Gender.WOMAN, 45, Portfolio.RICH, 300);
        painter.hello();
        painter.draw();





    }


}