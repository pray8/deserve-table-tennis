package table_tennis_game;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PlayTableTennisTest {
    // Creating dummy data for test.
    Player dummyFirstPlayer = null;
    Player dummySecondPlayer = null;
    TableTennis classTableTennisTest = null;
    PlayTableTennis classUnderTest = null;

    @Before
    public void setUp() throws Exception {
        this.dummyFirstPlayer = new Player(1, "Dummy first player");
        this.dummySecondPlayer = new Player(2, "Dummy second player");
        this.classTableTennisTest = new TableTennis(this.dummyFirstPlayer, this.dummySecondPlayer);
        this.classUnderTest = new PlayTableTennis();
    }

    @Test
    public void testPlayTableTennis() {
        List<Player> winnerAndRunnerUpPlayers = this.classUnderTest.playTableTennis();
        /*
         * Winner will be one of dummyFirstPlayer or dummySecondPlayer and 0th index of
         * variable winnerAndRunnerUpPlayers -> defined in above line contains the
         * winner.
         */
        assertTrue(this.dummyFirstPlayer.getId() == winnerAndRunnerUpPlayers.get(0).getId()
                || this.dummySecondPlayer.getId() == winnerAndRunnerUpPlayers.get(0).getId());
    }
}
