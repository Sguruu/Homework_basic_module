package lesson.lesson_7;

public class PersonMoney extends Person {
    private int income; // доход

    @Override
    public void introduceYourself() {
        super.introduceYourself();
        System.out.print(" мой доход " + income);
    }

    public PersonMoney(String name, String surname, int age) {
        super(name, surname, age);
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }
}



