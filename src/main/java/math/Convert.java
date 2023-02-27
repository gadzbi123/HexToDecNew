/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package math;

import java.util.Vector;

/**
 * Class that has every conversion method in program
 *
 * @author Kacper Nitkiewicz
 * @version 1.0
 */
public class Convert {

    //digits in hexadecimal
    public String digits = "0123456789abcdef";

    /**
     * Converts the hexStr numbers to a decimal number
     *
     * @param hexStr String of hexStr value
     * @throws ConvertException with error in string
     * @return decimal number in string
     *
     */
    public String hexToDec(String hexStr) throws ConvertException {

        if (hexStr == null || hexStr.equalsIgnoreCase("")) {
            throw new ConvertException("Exception: Inserted no value");
        }

        hexStr = hexStr.toLowerCase();

        if (!hexStr.matches("-?[a-f0-9]+")) {
            throw new ConvertException("Exception: Inserted wrong hexadecimal character");
        }

        if (!isNumeric(hexStr)) {
            throw new ConvertException("Exception: Not a hex number or number is too big");
        }

        int dec = 0;
        int i = 0;
        boolean isNegative = false;

        if (hexStr.charAt(0) == '-') {
            isNegative = true;
            i = 1;
        }

        for (; i < hexStr.length(); i++) {
            char letter = hexStr.charAt(i);
            dec = 16 * dec + digits.indexOf(letter);
        }

        if (isNegative) {
            dec *= -1;
        }

        String decStr = Integer.toString(dec);

        return decStr;
    }

    /**
     * Converts the decial numbers to a hex number
     *
     * @param decStr String of dec value
     * @throws ConvertException if wrong parameter was put
     * @return hexadecimal number in string
     *
     */
    public String decToHex(String decStr) throws ConvertException {
        if (decStr == null || decStr.contentEquals("")) {
            throw new ConvertException("Exception: Inserted no value");
        }

        decStr = decStr.toLowerCase();

        if (!decStr.matches("-?[0-9]+")) {
            throw new ConvertException("Exception: Inserted wrong decimal character");
        }

        if (!isNumeric(decStr)) {
            throw new ConvertException("Exception: Not a  dec number or number is too big");
        }

        int dec = Integer.parseInt(decStr);
        String hex = "";
        int i = Math.abs(dec);

        do {
            hex = digits.charAt(i % 16) + hex;
            i = i / 16;
        } while (i != 0);

        if (dec < 0) {
            hex = "-" + hex;
        }

        return hex;
    }

    /**
     * Checks if a string is a number
     *
     * @param strNum String of any value
     * @return boolean
     *
     */
    private boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            Integer.parseInt(strNum, 16);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
