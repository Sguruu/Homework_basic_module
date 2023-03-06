package task_7_0.new_task.varvara;
public class Accountant extends Employee{
    Accountant(String name, String lastName, int age, Gender gender, WorkExperience workExperience, int salary) {
        super(name, lastName, gender, age, workExperience, salary);
    }
    @Override
    public void hello(){
        super.hello();
        System.out.println(" бухгалтер");
    }

    public void makeCalculations(){
        System.out.println(" Я могу производить разные рассчеты и высчитать тебе зарплату!!");
    }
}
