package task_7_0.new_task.varvara;
public enum Gender {
    MAN("Мужчина"),
    WOMAN("Женщина");

    public final String text;
    Gender(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
