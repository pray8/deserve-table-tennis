package table_tennis_game;

import java.util.ArrayList;
import java.util.List;

public class PlayTableTennis {
    private Player firstPlayer = new Player(1, "Ramesh");
    private Player secondPlayer = new Player(2, "Suresh");
    private TableTennis tableTennis = new TableTennis(this.firstPlayer, this.secondPlayer);

    public List<Player> playTableTennis() {
        Player winnerPlayer = tableTennis.getTableTennisWinner();
        Player loserPlayer = null;
        if (winnerPlayer == firstPlayer) {
            loserPlayer = secondPlayer;
        } else {
            loserPlayer = firstPlayer;
        }
        List<Player> players = new ArrayList<>();
        // Always returning winner at 0th index.
        players.add(winnerPlayer);
        players.add(loserPlayer);
        return players;
    }
}
