/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import math.Convert;
import math.ConvertException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Class contains tests that check dec to hex conversion
 *
 * @author Kacper Nitkiewicz
 * @version 1.0
 */
public class ConvertDecToHexTest {

    private Convert convert = new Convert();
    private String valueStr = "";

    /**
     * Method takes a values given in dec and checks if result is same as on the
     * right of comma
     *
     * @param input - value given by user
     * @param expected - value which is a result of convert function
     */
    @ParameterizedTest
    @CsvSource({"10,a", "171,ab", "2766,ace", "0,0", "-17,-11"})
    void convertCorrectValuesTest(String input, String expected) {
        try {
            String converted = convert.decToHex(input);
            assertEquals(converted, expected, "Value should be converted to decimal!");
        } catch (ConvertException e) {
            fail();
        }
    }

    /**
     * Method checks what happens when user puts empty text
     *
     * @param nullVar - empty text
     */
    @ParameterizedTest
    @NullSource
    @EmptySource
    @ValueSource(strings = {""})
    void emptyTest(String nullVar) {
        try {
            valueStr = convert.decToHex(nullVar);
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
    @ValueSource(strings = {"jacek", "marySIa,jurek", "OLA"})
    void notConvertableTest(String notConv) {
        try {
            valueStr = convert.decToHex(notConv);
            fail("Expected not to convert!");
        } catch (ConvertException e) {
            assert true;
        }
    }

    /**
     * Method checks if user has given a value that is too big to convert
     *
     * @param notConv - value that shouldnt be converted
     */
    @ParameterizedTest
    @ValueSource(strings = {"9999999999999999999", "372846238746871687326", "8218472985728969829292"})
    void tooBigNumberTest(String notConv) {
        try {
            valueStr = convert.decToHex(notConv);
            fail("Expected not to convert!");
        } catch (ConvertException e) {
            assert true;
        }
    }
}
