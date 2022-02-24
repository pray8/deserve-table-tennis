package table_tennis_game;

public final class Constant {
    /*
     * turn variable can be set to 0 to ensure 1st player starts the game or
     * it can be set to 2 to ensure 2nd player starts the game.
     */
    public static final int INITIAL_TURN_VALUE = 0;

    public static final int MAX_POSSIBLE_SCORE = 21;
    public static final int RANDOM_NUMBER_MIN_VALUE = 0;
    public static final int RANDOM_NUMBER_MAX_VALUE = 9;
    public static final int INITIAL_WINNING_POINT = 11;
    public static final int FINAL_WINNING_POINT = 21;
    public static final int TWO_POINT_LEAD = 2;

    public static final String NOT_TIED = "NOT_TIED";
    public static final String TIED_AT_10_10 = "TIED_AT_10_10";
    public static final String TIED_AT_20_20 = "TIED_AT_20_20";
}
