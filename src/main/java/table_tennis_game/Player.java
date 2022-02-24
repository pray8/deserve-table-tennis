package table_tennis_game;

public class Player {
    private int id;
    private String name;
    private int score;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score < 0 || score > Constant.MAX_POSSIBLE_SCORE) {
            System.out.println("'score' value less than 0 or greater than 21 not allowed");
            System.exit(0);
        }
        this.score = score;
    }

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
        this.score = 0;
    }
}
