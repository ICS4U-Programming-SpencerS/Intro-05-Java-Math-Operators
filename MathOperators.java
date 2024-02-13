/**
* Program designed to test math operators in Java!.
*
* @author  Spencer S.
* @version 1.0
* @since   2024-Feb-12
*/
import java.util.Scanner;

public final class MathOperators{ 
    /**
    * Stops random instantiation's from happening.
    */
    private MathOperators() {
        // Prevents instantiation.
    }
    /**
    * Main function code.
    *
    * @param args Command line arguments (not used).
    */
    public static void main(String[] args) {
        // Input setup line. Allows for user input.
        Scanner input = new Scanner(System.in);
        // Opening print statements + user input.
        System.out.println("This program is designed to test basic math operators.");
        System.out.println("In the next line, input value A!");
        float value1 = input.nextFloat();
        System.out.println("In the next line, input value B!");
        float value2 = input.nextFloat();
        System.out.println("-----------------------");

        // Basic float values and equations.
        float adding = value1 + value2;
        float subtract = value1 - value2;
        float multiply = value1 * value2;
        float divide = value1 / value2;
        // Converted from floats to doubles.
        double value1double = value1;
        double value2double = value2;
        double divideDouble = value1double / value2double;
        // Converts to ins for exponents.
        int value2int = (int) Math.round(value2);
        double exponent = Math.pow(value1, value2int);
        // Square root of only valueA.
        double square = Math.sqrt(value1double);

        // This contains each math operator's final result.
        // This is just prints statements
        System.out.println(value1 + " + " + value2 + " = " + adding);
        System.out.println(value1 + " - " + value2 + " = " + subtract);
        System.out.println(value1 + " * " + value2 + " = " + multiply);
        System.out.println(value1 + " / " + value2 + " = " + divide);
        System.out.println(value1 + " / " + value2 + " = " + divideDouble);
        System.out.println(value1 + " ^ " + value2 + " = " + exponent);
        System.out.println("√"+ value1 + " = " + square);
    }
}
