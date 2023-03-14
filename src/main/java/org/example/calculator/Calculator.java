package org.example.calculator;

public class Calculator {

    public static int addNumber(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public static int subtraction(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }

    public static int multiplication(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }

    public static double division(int numberOne, int numberTwo) throws IllegalAccessException {
        if (numberTwo != 0) {
            return (double) numberOne / numberTwo;
        }
        throw new IllegalAccessException("Dividing by zero can cause the end of the universe!");
    }

    public static int findRemainder(int numberOne, int numberTwo) {
        return numberOne%numberTwo;
    }
}
