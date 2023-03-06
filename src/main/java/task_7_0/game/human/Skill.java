package task_7_0.game.human;

public enum Skill {
    JUNIOR("Начинающий"),
    MIDDLE("Продолжающий"),
    SENIOR("Мастер");

    private final String text;

    Skill(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
