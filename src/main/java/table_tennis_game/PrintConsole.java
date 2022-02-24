package table_tennis_game;

public final class PrintConsole {
    public static final void printEachTurnDetail(Player goingToServePlayer, Player playerWhoWonPointInCurrentTurn,
            Player firstPlayer, Player secondPlayer) {
        System.out.println("-----------------------------------------");

        System.out.print("Served by - ");
        System.out.println(goingToServePlayer.getName());
        System.out.println();

        System.out.print("Point won by - ");
        System.out.println(playerWhoWonPointInCurrentTurn.getName());
        System.out.println();

        System.out.print("First player - ");
        System.out.print(firstPlayer.getName());
        System.out.print(",   ");
        System.out.print("Score - ");
        System.out.println(firstPlayer.getScore());

        System.out.print("Second player - ");
        System.out.print(secondPlayer.getName());
        System.out.print(",  ");
        System.out.print("Score - ");
        System.out.println(secondPlayer.getScore());

        System.out.println("-----------------------------------------");
    }

    public static final void printWinnerAndRunnerUp(Player winner, Player runnerUp) {
        System.out.println();
        System.out.println("************************************");
        System.out.print("Winner - ");
        System.out.print(winner.getName());
        System.out.print(",     ");
        System.out.print("Score - ");
        System.out.println(winner.getScore());

        System.out.println();

        System.out.print("Runner up - ");
        System.out.print(runnerUp.getName());
        System.out.print(",  ");
        System.out.print("Score - ");
        System.out.println(runnerUp.getScore());
        System.out.println("************************************");
    }
}
