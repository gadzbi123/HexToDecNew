/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import math.Convert;
import math.ConvertException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

/**
 * Class contains tests that check hex to dec conversion
 *
 * @author Kacper Nitkiewicz
 * @version 1.0
 */
public class ConvertHexToDecTest {

    private Convert convert = new Convert();
    private String valueStr;

    /**
     * Method takes a values given in hex and checks if result is same as on the
     * right of comma
     *
     * @param input - value given by user
     * @param expected - value which is a result of convert function
     */
    @ParameterizedTest
    @CsvSource({"a,10", "ab,171", "Ace,2766", "0,0" , "-11,-17"})
    void convertCorrectValuesTest(String input, String expected) {
        try {
            String converted = convert.hexToDec(input);
            assertEquals(converted, expected, "Value should be converted to decimal!");
        } catch (ConvertException e) {
            fail();
        }
    }

    /**
     * Method checks what happens when user puts empty text
     *
     * @param nullVar - empty value
     */
    @ParameterizedTest
    @NullSource
    @EmptySource
    @ValueSource(strings = {""})
    void emptyTest(String nullVar) {
        try {
            valueStr = convert.hexToDec(nullVar);
            fail("Input is empty");
        } catch (ConvertException e) {
            assert true;
        }
    }

    /**
     * Method tests if parametered values aren't converted
     *
     * @param notConv - values that cant or shouldnt be converted
     */
    @ParameterizedTest
    @ValueSource(strings = {"jacek", "marysia,jurek", "OLA"})
    void notConvertableTest(String notConv) {
        try {
            valueStr = convert.hexToDec(notConv);
            fail("Expected not to convert!");
        } catch (ConvertException e) {
            assert true;
        }
    }

    /**
     * Method checks if any caption in letters is supported when converting
     *
     * @param input - user given value
     * @param expected - converted value
     */
    @ParameterizedTest
    @CsvSource({"AFC,2812", "EaF,3759", "CcCc,52428"})
    void capsAndNotCapsTest(String input, String expected) {
        try {
            valueStr = convert.hexToDec(input);
            assertEquals(valueStr, expected, "Convert to correct value with diffrent caps");
        } catch (ConvertException e) {
            fail("Expected to convert values!");
        }
    }

    /**
     * Method checks if user has given a value that is too big to convert
     *
     * @param notConv - value that shouldnt be converted
     */
    @ParameterizedTest
    @ValueSource(strings = {"aaaaaaaaaaaaaaaaaaa", "ffffffffffffffffff", "cececececccddcdcdcdceeaaaaa"})
    void tooBigNumberTest(String notConv) {
        try {
            valueStr = convert.hexToDec(notConv);
            fail("Expected not to convert!");
        } catch (ConvertException e) {
            assert true;
        }
    }

  
}
