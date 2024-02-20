package com.example;

import java.util.Scanner;

/**
 * Does cool math operators.
 *
 * @author Spencer S.
 * @version 1.0
 * @since 2024-Feb-08
 */
public final class MathOperators {
  /** Stops random instantiation's from happening. */
  private MathOperators() {
    // Prevents instantiation.
  }

  /**
   * Main function code.
   *
   * @param args Command line arguments (not used).
   */
  public static void main(final String[] args) {

    // Input setup line. Allows for user input.
    final Scanner in = new Scanner(System.in);
    // Opening print statements + user input.
    System.out.println("This program is designed to test.");
    System.out.println("In the next line, input value A!");
    final float value1 = in.nextFloat();
    System.out.println("In the next line, input value B!");
    final float value2 = in.nextFloat();
    System.out.println("-----------------------");

    // Basic float values and equations.
    final float adding = value1 + value2;
    final float subtract = value1 - value2;
    final float multiply = value1 * value2;
    final float divide = value1 / value2;
    // Converted from floats to doubles.
    final double value1double = value1;
    final double value2double = value2;
    final double divideDouble = value1double / value2double;
    // Converts to ins for exponents.
    final int value2int = (int) Math.round(value2);
    final double exponent = Math.pow(value1, value2int);
    // Square root of only valueA.
    final double square = Math.sqrt(value1double);

    // This contains each math operator's final result.
    // This is just prints statements
    System.out.println(value1 + " + " + value2 + " = " + adding);
    System.out.println(value1 + " - " + value2 + " = " + subtract);
    System.out.println(value1 + " * " + value2 + " = " + multiply);
    System.out.println(value1 + " / " + value2 + " = " + divide);
    System.out.println(value1 + " / " + value2 + " = " + divideDouble);
    System.out.println(value1 + " ^ " + value2 + " = " + exponent);
    System.out.println("√" + value1 + " = " + square);
    in.close();
  }
}
