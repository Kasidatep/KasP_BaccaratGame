package componance.ingame;

public enum face {
    a (1, "A"),
    b (2, "2"),
    c (3, "3"),
    d (4, "4"),
    e (5, "5"),
    f (6, "6"),
    g (7, "7"),
    h (8, "8"),
    i (9, "9"),
    j (10, "10"),
    k (10, "J"),
    l (10, "Q"),
    m (10, "K");

    private final int score;
    private final String text;

    face(int score, String text){
        this.score = score;
        this.text = text;
    }

    @Override
    public String toString() {
        return "face{" +
                "score=" + score +
                ", text='" + text + '\'' +
                '}';
    }

    public int getScore() {
        return score;
    }

    public String getText() {
        return text;
    }
}
