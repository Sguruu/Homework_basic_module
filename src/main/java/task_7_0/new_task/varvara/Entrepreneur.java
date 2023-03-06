package task_7_0.new_task.varvara;
public class Entrepreneur extends  Person{
    String occupation;
    BusinessSize businessSize;

    Entrepreneur(String name, String lastName, Gender gender, int age, String occupation, BusinessSize businessSize) {
        super(name, lastName, gender, age);
            setOccupation(occupation);
            setBusinessSize(businessSize);
    }


    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public BusinessSize getBusinessSize() {
        return businessSize;
    }

    public void setBusinessSize(BusinessSize businessSize) {
        this.businessSize = businessSize;
    }

    @Override
    public void hello(){
        super.hello();
        System.out.println("у меня есть свой " + " "
                + businessSize.getText() + " " + " ресторанный бизнес. На данный момент у меня 7 ресторанов!");
    }
    public void doBusiness(){
        System.out.println(getName() + " " + getLastName() + " ведёт ресторанный бизнес.");
    }

}
