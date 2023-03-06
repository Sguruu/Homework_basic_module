package task_7_0.new_task.varvara;

public enum WorkExperience {
    NEWBIE("Новичок"),
    EXPERIENCED("Опытный"),
    MASTER("Мастер");

    public final String text;
    WorkExperience(String text){

        this.text = text;
    }

    public String getText() {

        return text;
    }
}
