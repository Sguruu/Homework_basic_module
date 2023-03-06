package task_7_0.new_task.varvara;
public class Freelancer extends Person{
    private Portfolio portfolio;
    private int hourlyCost;

    Freelancer(String name, String lastName, Gender gender, int age, Portfolio portfolio, int hourlyCost) {
        super(name, lastName, gender, age);
        this.portfolio = portfolio;
        this.hourlyCost = hourlyCost;

    }

    @Override
    public void hello(){
        super.hello();
        System.out.println("У меня довольно " + portfolio.getText() + " " + "портфолио, я работаю за " + hourlyCost + " руб. в час");
    }


}
