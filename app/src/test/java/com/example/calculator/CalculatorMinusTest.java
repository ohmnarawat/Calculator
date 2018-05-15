package com.example.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorMinusTest {

    @Test
    public void minus_isCorrect() {
        // Arrange
        Calculator calculator = new Calculator();
        // Act
        int actualResult = calculator.minus(1, 1);
        // Assert
        assertEquals(0, actualResult);
    }

}