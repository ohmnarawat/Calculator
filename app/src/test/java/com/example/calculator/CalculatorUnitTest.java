package com.example.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CalculatorUnitTest {

    private int first;
    private int second;
    private int expectedResult;

    public CalculatorUnitTest(int first, int second, int expectedResult) {
        this.first = first;
        this.second = second;
        this.expectedResult = expectedResult;
    }

    @Test
    public void addition_isCorrect() {
        // Arrange
        Calculator calculator = new Calculator();
        // Act
        int actualResult = calculator.plus(first, second);
        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Parameters(name = "{index}: {0} + {1} = {2}")
    public static List<Object[]> dataTest() {
        return Arrays.asList(new Object[][] {
                {1, 1, 2},
                {2, 2, 4},
                {2, 3, 5}
        });
    }

}
