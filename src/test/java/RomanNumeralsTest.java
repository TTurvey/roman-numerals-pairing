import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralsTest {

    @Test public
    void return_I_when_one () {
        assertEquals( "I" , new RomanNumerals().convert(1) );
    }
    @Test public
    void return_II_when_two () {
        assertEquals( "II" , new RomanNumerals().convert(2) );
    }
}