package task_7_0.new_task.valera.freelancer;

import task_7_0.new_task.valera.Portfolio;
import task_7_0.new_task.valera.human.Sex;

public class Photographer extends Freelancer {

    public Photographer (String name, String surname, byte age, Sex sex, Portfolio portfolio, int hourWorkCost){
        super(name, surname, age, sex, portfolio, hourWorkCost);
    }

    @Override
    public void introduceYourself(){
        super.introduceYourself();
        System.out.println(" фотографом.");
    }
    public void makePhotos (){
        System.out.println(getName() + " " + getSurname() + " делает фотографии.");
    }
}
