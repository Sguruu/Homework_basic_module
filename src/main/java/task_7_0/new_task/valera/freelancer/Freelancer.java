package task_7_0.new_task.valera.freelancer;

import task_7_0.new_task.valera.human.HumanValera;
import task_7_0.new_task.valera.Portfolio;
import task_7_0.new_task.valera.human.Sex;

public class Freelancer extends HumanValera {
    private Portfolio portfolio;
    private int hourWorkCost;

    public Freelancer(String name, String surname, byte age, Sex sex, Portfolio portfolio, int hourWorkCost) {
        super(name, surname, age, sex);
        setPortfolio(portfolio);
        setHourWorkCost(hourWorkCost);
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public int getHourWorkCost() {
        return hourWorkCost;
    }

    public void setHourWorkCost(int hourWorkCost) {
        try {
            if (hourWorkCost > 0) {
                this.hourWorkCost = hourWorkCost;
            } else {
                throw new Exception("Ошибка. Размер оплаты за час должен быть больше 0");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void introduceYourself() {
        super.introduceYourself();
        System.out.print("У меня " + portfolio.getRussianPortfolio() + " портфолио, я работаю за " + hourWorkCost + " руб. в час");
    }

}
