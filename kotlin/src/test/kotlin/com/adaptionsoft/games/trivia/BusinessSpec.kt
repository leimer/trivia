package com.adaptionsoft.games.trivia;

import com.adaptionsoft.games.uglytrivia.Game
import org.junit.Test;

class BusinessSpec {
    @Test
    fun gameShouldHaveAtLeastTwoPlayers() {
        val aGame = Game(Players.aNew("Chet", "Pat", null))
        aGame.roll(1)
    }
}
