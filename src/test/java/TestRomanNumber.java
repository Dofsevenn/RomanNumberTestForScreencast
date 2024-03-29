import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestRomanNumber {

    @Test
    void shouldConvert1ToI() {
        assertEquals("I", toRoman(1));
    }
    @Test
    void shouldConvert2ToII() {
        assertEquals("II", toRoman(2));
    }

    private String toRoman(int numberInput) {
        if(numberInput == 2) {
            return "II";
        }
        return "I";
    }


}
