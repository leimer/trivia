package com.adaptionsoft.games.trivia

import com.adaptionsoft.games.trivia.runner.GameRunner
import org.junit.Assert
import org.junit.Ignore
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.PrintStream
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.util.*

class SomeTest {

    @Test
    @Ignore
    fun generateGoldenMaster() {
        for (seed in 0..100) {
            val file = File("gold/" + seed)
            file.createNewFile()
            System.setOut(PrintStream(file))
            GameRunner.runTheGame(Random(seed.toLong()))
        }
    }

    @Test
    fun checkWithGoldenMaster() {
        for (seed in 0..100) {
            val captured = ByteArrayOutputStream()
            System.setOut(PrintStream(captured))
            GameRunner.runTheGame(Random(seed.toLong()))
            val master = Files.readAllBytes(Paths.get("gold/" + seed))
            Assert.assertEquals(String(master), captured.toString())
        }
    }

}
