public class Option {
private String text;
private boolean correct;

    public Option(String text, boolean correct) {
        this.text = text;
        this.correct = correct;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    @Override
    public String toString() {
        return "Option{" +
                "text='" + text + '\'' +
                ", correct=" + correct +
                '}';
    }
}
