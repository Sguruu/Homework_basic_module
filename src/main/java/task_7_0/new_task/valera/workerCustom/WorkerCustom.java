package task_7_0.new_task.valera.workerCustom;

import task_7_0.new_task.valera.Experience;
import task_7_0.new_task.valera.human.HumanValera;
import task_7_0.new_task.valera.human.Sex;

public class WorkerCustom extends HumanValera {
    private Experience experience;
    private int salary;

    public WorkerCustom(String name, String surname, byte age, Sex sex, Experience experience, int salary) {
        super(name, surname, age, sex);
        setExperience(experience);
        setSalary(salary);
    }

    public Experience getExperience() {
        return experience;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        try {
            if (salary >= 13_890) {
                this.salary = salary;
            } else {
                this.salary = 13_890;
                throw new Exception("Ошибка. Минимальный размер оплаты труда составляет 13_890 рублей (ФЗ №406-ФЗ от 06.12.2021)");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void introduceYourself() {
        super.introduceYourself();
        System.out.print("Я " + experience.getRussianExperience());
    }
}

