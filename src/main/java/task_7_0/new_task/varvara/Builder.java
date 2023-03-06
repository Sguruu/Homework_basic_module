package task_7_0.new_task.varvara;
public class Builder extends Employee{

    Builder(String name, String lastName, int age, Gender gender, WorkExperience workExperience, int salary) {
        super(name, lastName, gender, age, workExperience, salary);
    }
    @Override
    public void hello(){
        super.hello();
        System.out.println(" Строитель ");
    }

   public void build(){
        System.out.println("Могу построить хоть что!");
    }
}
