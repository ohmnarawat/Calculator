package com.example.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorDivideTest {

    @Test
    public void divide_isCorrect() {
        // Arrange
        Calculator calculator = new Calculator();
        // Act
        int actualResult = calculator.divide(1, 1);
        // Assert
        assertEquals(1, actualResult);
    }
}