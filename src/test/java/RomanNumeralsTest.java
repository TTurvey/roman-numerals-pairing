import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralsTest {
    RomanNumerals romanNumerals;
    @BeforeEach
    void setup() {
        romanNumerals = new RomanNumerals();
    }

    @ParameterizedTest
    @CsvSource({
            "1, I",
            "2, II",
            "3, III",
            "4, IV",
            "5, V",
            "6, VI",
            "9, IX",
            "10, X",
            "20, XX",
            "17, XVII",
            "40, XL",
            "60, LX",
            "90, XC",
            "100, C",
            "400, CD",
            "500, D",
            "900, CM",
            "1000, M"
    })

    void converts_number_to_numeral (int input, String output) {
        assertEquals( output , romanNumerals.convert(input) );
    }

}