import java.sql.SQLOutput;

public class RomanNumerals {
    enum Numerals {
        FOUR("IV", 4),
        FIVE("V", 5),
        NINE("IX", 9),
        TEN("X", 10),
        FORTY("XL", 40),
        FIFTY("L", 50),
        NINETY("XC", 90),
        HUNDRED("C", 100),
        FOUR_HUNDRED("CD", 400),
        FIVE_HUNDRED("D", 500),
        NINE_HUNDRED("CM", 900),
        THOUSAND("M", 1000);

        public final String roman;
        public final int number;

        Numerals(String roman, int number) {
            this.roman = roman;
            this.number = number;
        }
    }


    public String convert(int input) {
        String result = "";

        for (Numerals numeral : Numerals.values()) {
            while (input >= numeral.number) {
                result += numeral.roman;
                input -= numeral.number;
                System.out.println(numeral.number);
                System.out.println(numeral.roman);
            }
        }

        result += "I".repeat(input);

        return result;
    }
}
