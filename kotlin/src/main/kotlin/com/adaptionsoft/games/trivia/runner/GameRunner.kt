package com.adaptionsoft.games.trivia.runner

import com.adaptionsoft.games.uglytrivia.Game
import java.util.*

object GameRunner {
    var notAWinner: Boolean = false

    fun runTheGame(rand: Random) {
        val aGame = Game()

        aGame.add("Chet")
        aGame.add("Pat")
        aGame.add("Sue")

        do {

            aGame.roll(rand.nextInt(5) + 1)

            if (rand.nextInt(9) == 7) {
                GameRunner.notAWinner = aGame.wrongAnswer()
            } else {
                GameRunner.notAWinner = aGame.wasCorrectlyAnswered()
            }


        } while (GameRunner.notAWinner)
    }
}

fun main(args: Array<String>) {
    GameRunner.runTheGame(Random())
}

