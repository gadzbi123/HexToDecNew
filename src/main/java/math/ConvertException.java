/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package math;
/**
 * Class that creates a convert exceptions
 * @author Kacper Nitkiewicz
 * @version 1.0
 * 
 */
public class ConvertException extends Exception {
     
/**
 * Creates a error message on screen with given string message
 * @param message string with a message about a error
 * 
 */
    public ConvertException(String message)
    {
        super(message);
    }
}
