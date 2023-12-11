import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestMyAss {

    @Test
    fun hello(){
        val t = 10;
        Assertions.assertTrue(2 * t < 22)
    }
}