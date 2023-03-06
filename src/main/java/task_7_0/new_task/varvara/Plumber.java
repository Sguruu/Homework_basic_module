package task_7_0.new_task.varvara;

public class Plumber extends Employee{
    Plumber(String name, String lastName, int age, Gender gender, WorkExperience workExperience, int salary) {
        super(name, lastName, gender, age, workExperience, salary);
    }
    @Override
    public void hello(){
        super.hello();
        System.out.println(" Сантехник");
    }

    public void repairPipes(){

        System.out.println(" Я могу чинить трубы!");
    }
}
