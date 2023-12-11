import org.example.sum
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestMyAss {

    @Test
    fun hello() {
        val t = 10;
        Assertions.assertTrue(2 * t < 22)
    }

    @Test
    fun hello2() {
        Assertions.assertTrue(sum(1, 1) == 2)
    }
}