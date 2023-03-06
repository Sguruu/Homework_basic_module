package task_7_0.new_task.varvara;
public class Employee extends Person {
    WorkExperience workExperience;
    private  int salary;

    Employee(String name, String lastName, Gender gender, int age, WorkExperience workExperience, int salary ) {
        super(name, lastName, gender, age);
        setWorkExperience(workExperience);
        setSalary(salary);
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(WorkExperience workExperience) {
        this.workExperience = workExperience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        try {
            if (salary >= 13_890) {
                this.salary = salary;
            } else {
                throw new Exception("Ошибка. Минимальный прожиточный минимум равен 13_890 рублей.");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
public void hello(){
        super.hello();
    System.out.println("Я " + " " + workExperience.getText());
}

}
