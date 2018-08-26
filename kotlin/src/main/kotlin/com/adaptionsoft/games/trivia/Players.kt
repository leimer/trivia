package com.adaptionsoft.games.trivia

class Players(
        val players: List<String>
) {
    companion object {
        fun aNew(p1: String, p2: String, p3: String?): Players {
            return Players(listOfNotNull(p1, p2, p3))
        }
    }
}
