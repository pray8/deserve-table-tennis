/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package table_tennis_game;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Player> players = new PlayTableTennis().playTableTennis();
        /*
         * "playTableTennis" function called above always returns a list of Player with
         * winner at 0th index and runner up at 1st index.
         */
        PrintConsole.printWinnerAndRunnerUp(players.get(0), players.get(1));
    }
}
