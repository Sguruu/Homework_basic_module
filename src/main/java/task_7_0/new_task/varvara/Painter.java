package task_7_0.new_task.varvara;
public class Painter extends Freelancer{


    Painter(String name, String lastName, Gender gender, int age, Portfolio portfolio, int hourlyCost) {
        super(name, lastName, gender, age, portfolio, hourlyCost);
    }

    @Override
    public void hello(){
        super.hello();
        System.out.println(" художник, рисую работы на заказ, а также у меня есть большая галлерея в которой есть все мои работы!");
    }
    public void draw (){
        System.out.println(getName() + " " + getLastName() + " творит и рисует.");
    }


}
