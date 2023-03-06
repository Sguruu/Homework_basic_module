package task_7_0.new_task.valera.workerCustom;

import task_7_0.new_task.valera.Experience;
import task_7_0.new_task.valera.human.Sex;

public class Accountant extends WorkerCustom {

    public Accountant (String name, String surname, byte age, Sex sex, Experience experience, int salary){
        super(name, surname, age, sex, experience, salary);
    }

    @Override
    public void introduceYourself(){
        super.introduceYourself();
        System.out.println(" бухгалтер");
    }

    public void count(){
        System.out.println(getName() + " " + getSurname() + " делает рассчёты.");
    }
}
