package task_7_0.new_task.valera.workerCustom;

import task_7_0.new_task.valera.Experience;
import task_7_0.new_task.valera.human.Sex;

public class Builder extends WorkerCustom {

    public Builder(String name, String surname, byte age, Sex sex, Experience experience, int salary) {
        super(name, surname, age, sex, experience, salary);
    }

    @Override
    public void introduceYourself(){
        super.introduceYourself();
        System.out.println(" строитель.");
    }

    public void build (){
        System.out.println(getName() + " " + getSurname() + " строит.");
    }
}
