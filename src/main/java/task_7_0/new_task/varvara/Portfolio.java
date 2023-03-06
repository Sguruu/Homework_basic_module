package task_7_0.new_task.varvara;

enum Portfolio {
    RICH("большое"),
    MEAGER("скромное");
    private final String text;

    Portfolio(String text) {

        this.text = text;
    }

    public String getText() {

        return text;
    }
}


