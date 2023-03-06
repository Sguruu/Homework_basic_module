package task_7_0.new_task.valera.human;

public enum Sex {
    MAN("мужчина"),
    WOMAN("женщина");
    private final String russianSex;

    Sex(String russianSex) {
        this.russianSex = russianSex;
    }

    public String getRussianSex() {
        return russianSex;
    }
}
