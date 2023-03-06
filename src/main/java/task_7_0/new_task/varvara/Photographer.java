package task_7_0.new_task.varvara;

public class Photographer extends  Freelancer{


    Photographer(String name, String lastName, Gender gender, int age, Portfolio portfolio, int hourlyCost) {
        super(name, lastName, gender, age, portfolio, hourlyCost);
    }

    @Override
    public void hello(){
        super.hello();
        System.out.println(" фотографом!");
    }

    public void takePhotos(){
        System.out.println(" Я делаю отличные фотографии, обращайся!");
    }
}
