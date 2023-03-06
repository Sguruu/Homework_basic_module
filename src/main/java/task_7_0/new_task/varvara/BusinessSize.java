package task_7_0.new_task.varvara;
public enum BusinessSize {
    SMALL("Маленький"),
    MEDIUM("Средний"),
    LARGE("Большой");
    public final String text;
    BusinessSize(String text){
        this.text = text;
    }

    public String getText() {

        return text;
    }

}
