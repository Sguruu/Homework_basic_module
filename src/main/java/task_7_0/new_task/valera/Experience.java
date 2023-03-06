package task_7_0.new_task.valera;

public enum Experience {
    BEGINNER("начинающий"),
    EXPERIENCED("опытный"),
    MASTER("мастер");

    private final String russianExperience;

    Experience(String russianExperience) {
        this.russianExperience = russianExperience;
    }

    public String getRussianExperience() {
        return russianExperience;
    }
}
