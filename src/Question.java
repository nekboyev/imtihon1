import java.util.List;

public class Question {
    private String text;
    private QuestionLevelEnum level;
    private List<Option> opions;

    public Question(String text, QuestionLevelEnum level, List<Option> opions) {
        this.text = text;
        this.level = level;
        this.opions = opions;
    }

    public Question() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public QuestionLevelEnum getLevel() {
        return level;
    }

    public void setLevel(QuestionLevelEnum level) {
        this.level = level;
    }

    public List<Option> getOpions() {
        return opions;
    }

    public void setOpions(List<Option> opions) {
        this.opions = opions;
    }

    @Override
    public String toString() {
        return "Question{" +
                "text='" + text + '\'' +
                ", level=" + level +
                ", opions=" + opions +
                '}';
    }
}
