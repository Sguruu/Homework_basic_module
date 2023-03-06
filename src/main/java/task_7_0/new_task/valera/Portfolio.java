package task_7_0.new_task.valera;

public enum Portfolio {
    RICH("большое"),
    MEAGER("скромное");
    private final String russianPortfolio;

    Portfolio(String russianPortfolio) {
        this.russianPortfolio = russianPortfolio;
    }

    public String getRussianPortfolio() {
        return russianPortfolio;
    }
}
