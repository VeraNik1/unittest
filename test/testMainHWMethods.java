import hw.MainHW;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.*;

public class testMainHWMethods {
    private MainHW testNum = new MainHW();

    @Test
    @DisplayName("Number is even")
    public void testEvenNumber() {
        boolean result = testNum.evenOddNumber(4);
        assertTrue(result);
    }

    @Test
    @DisplayName("Number is odd")
    public void testOddNumber() {
        boolean result = testNum.evenOddNumber(7);
        assertFalse(result);
    }

    // Проверка чисел, которые попадают в интервал (25;100)

    @ParameterizedTest
    @CsvSource(value = {"26", "50", "99"})
    @DisplayName("Number is in the interval (25; 100)")
    public void testNumberInInterval(int number) {

        assertTrue(testNum.numberInInterval(number));}


    // Проверка чисел, которые не попадают в интервал (25;100)

   @DisplayName("Number is out of the interval (25; 100)")
   @ParameterizedTest
   @CsvSource(value = {"10", "25", "100", "500"})

   public void testNumberOutOfInterval(int number) {
       assertFalse(testNum.numberInInterval(number));

    }
}
