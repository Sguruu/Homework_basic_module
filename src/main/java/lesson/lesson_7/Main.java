package lesson.lesson_7;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Света", "Агафонова", 19);

        PersonProfession personProfession = new PersonProfession(person.getName(), person.getSurname(), person.getAge());

        personProfession.setProfession("Продавец");
        personProfession.setExperience(3);

        Product product = new Product("Торт", 7, 450);

        Score score = new Score();

        score.employee = personProfession;
        score.product = product;

    }


}




