package table_tennis_game;

public class TableTennis {
    private Player firstPlayer;
    private Player secondPlayer;
    private int turn = Constant.INITIAL_TURN_VALUE;
    private String GAME_TIED_AT = Constant.NOT_TIED;

    public TableTennis(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public Player getPlayerServeTurn(int turn) {
        this.turn = this.turn % 4;
        if (this.turn == 0 || this.turn == 1) {
            this.turn += 1;
            return this.firstPlayer;
        } else {
            this.turn += 1;
            return this.secondPlayer;
        }
    }

    public int generateRandomNumber() {
        return (int) (Math.random() *
                (Constant.RANDOM_NUMBER_MAX_VALUE - Constant.RANDOM_NUMBER_MIN_VALUE + 1) +
                Constant.RANDOM_NUMBER_MIN_VALUE);
    }

    public Player getPlayerWhoWonPoint() {
        int generatedRandomValue = generateRandomNumber();
        if (generatedRandomValue % 2 == 0) {
            return this.firstPlayer;
        } else {
            return this.secondPlayer;
        }
    }

    public Player getTableTennisWinner() {
        while (true) {
            Player goingToServePlayer = getPlayerServeTurn(this.turn);
            Player playerWhoWonPointInCurrentTurn = getPlayerWhoWonPoint();

            if (playerWhoWonPointInCurrentTurn == this.firstPlayer) {
                this.firstPlayer.setScore(this.firstPlayer.getScore() + 1);
            } else {
                this.secondPlayer.setScore(this.secondPlayer.getScore() + 1);
            }

            if (this.firstPlayer.getScore() == 10 && this.secondPlayer.getScore() == 10) {
                GAME_TIED_AT = Constant.TIED_AT_10_10;
            }

            if (this.firstPlayer.getScore() == 20 && this.secondPlayer.getScore() == 20) {
                GAME_TIED_AT = Constant.TIED_AT_20_20;
            }

            switch (GAME_TIED_AT) {
                case "NOT_TIED":
                    if (this.firstPlayer.getScore() == Constant.INITIAL_WINNING_POINT) {
                        return this.firstPlayer;
                    }
                    if (this.secondPlayer.getScore() == Constant.INITIAL_WINNING_POINT) {
                        return this.secondPlayer;
                    }
                    break;

                case "TIED_AT_10_10":
                    if ((this.firstPlayer.getScore() - this.secondPlayer.getScore()) == Constant.TWO_POINT_LEAD) {
                        return this.firstPlayer;
                    }
                    if ((this.secondPlayer.getScore() - this.firstPlayer.getScore()) == Constant.TWO_POINT_LEAD) {
                        return this.secondPlayer;
                    }
                    break;

                case "TIED_AT_20_20":
                    if (this.firstPlayer.getScore() == Constant.FINAL_WINNING_POINT) {
                        return this.firstPlayer;
                    }
                    if (this.secondPlayer.getScore() == Constant.FINAL_WINNING_POINT) {
                        return this.secondPlayer;
                    }
                    break;
            }

            PrintConsole.printEachTurnDetail(goingToServePlayer, playerWhoWonPointInCurrentTurn,
                    firstPlayer, secondPlayer);
        }
    }
}
