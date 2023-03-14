package org.example.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


//@ExtendWith(MockitoExtension.class)
public class CalculatorTest {

   // @Mock
    private Calculator calculator;

    @Test
    public void addNumbers_shouldReturnCorrectSum_withPositiveNumbers() {

        final int expected = 10;
        //when(calculator.addNumber(5, 5)).thenReturn(expected);

        final int actual = Calculator.addNumber(5, 5);

        //verify(calculator).addNumber(5, 5);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void addNumbers_shouldReturnCorrectSum_withNegativeNumbers() {

        final int expected = -9;
        //when(calculator.addNumber(-5, -4)).thenReturn(expected);

        final int actual = Calculator.addNumber(-5, -4);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void multiplyNumbers_shouldReturnCorrectAmount_withPositiveNumbers() {
        final int expected = 25;
        //when(calculator.multiplication(5, 5)).thenReturn(25);
        final int actual = Calculator.multiplication(5, 5);
        assertThat(actual).isEqualTo(expected);

    }


    @Test
    public void multiplyNumbers_shouldReturnCorrectAmount_withNegativeNumbers() {
        final int expected = 49;
        //when(calculator.multiplication(-7, -7)).thenReturn(expected);
        final int actual = Calculator.multiplication(-7, -7);
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    public void subtractNumbers_shouldReturnCorrectAmount_withPositiveNumbers() {
        final int expected = 10;
        //when(calculator.subtraction(20, 10)).thenReturn(expected);
        final int actual = Calculator.subtraction(20, 10);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void subtractNumbers_shouldReturnCorrectAmount_withNegativeNumbers() {
        final int expected = 5;
        //when(calculator.subtraction(-5, -10)).thenReturn(expected);
        final int actual = Calculator.subtraction(-5, -10);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void subtractNumbers_shouldReturnCorrectAmount_withZero() {
        final int expected = -5;
        //when(calculator.subtraction(-5, 0)).thenReturn(expected);
        final int actual = Calculator.subtraction(-5, 0);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void divideNumbers_shouldReturnCorrectDouble_withPositiveNumbers() throws IllegalAccessException {
        final double expected = 5.0;
        //when(calculator.division(25, 5)).thenReturn(expected);
        final double actual = Calculator.division(25, 5);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void divideNumbers_shouldThrowDivideByZeroException_withDivisionWithZero() {

        Exception exception = assertThrows(
                Exception.class,
                () -> Calculator.division(25, 0));
        String expectedMessage = "Dividing by zero can cause the end of the universe!";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void findRemainder_shouldReturnRemainder_withPositiveNumbers(){
        final int expected =2;
        final int actual = Calculator.findRemainder(20, 3);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void findRemainder_shouldReturnRemainder_withOneNegativeNumbers(){
        final int expected =-1;
        final int actual = Calculator.findRemainder(-15, 2);
        assertThat(actual).isEqualTo(expected);
    }

}
