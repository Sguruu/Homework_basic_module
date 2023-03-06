package lesson.lesson_7;

public class PersonProfession extends Person {
    private String profession;
    private int experience;

    public PersonProfession(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public void introduceYourself() {
        super.introduceYourself();
        System.out.print(" моя профессия " + profession + " мой опыт " + experience);
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}





