package task_7_0.new_task.valera;

import task_7_0.new_task.valera.human.HumanValera;
import task_7_0.new_task.valera.human.Sex;

public class Businessman extends HumanValera {
    private String activityType;
    private BusinessSize businessSize;

    public Businessman(String name, String surname, byte age, Sex sex, String activityType, BusinessSize businessSize) {
        super(name, surname, age, sex);
        setActivityType(activityType);
        setBusinessSize(businessSize);
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public BusinessSize getBusinessSize() {
        return businessSize;
    }

    public void setBusinessSize(BusinessSize businessSize) {
        this.businessSize = businessSize;
    }

    @Override
    public void introduceYourself() {
        super.introduceYourself();
        System.out.println("Я имею " + businessSize.getRussianBusinessSize() + " бизнес в области " + activityType + ".");
    }

    public void doBusiness() {
        System.out.println(getName() + " " + getSurname() + " ведёт бизнес.");
    }
}

enum BusinessSize {
    SMALL("малый"),
    MEDIUM("средний"),
    LARGE("крупный");

    private final String russianBusinessSize;

    BusinessSize(String russianBusinessSize) {
        this.russianBusinessSize = russianBusinessSize;
    }

    public String getRussianBusinessSize() {
        return russianBusinessSize;
    }
}