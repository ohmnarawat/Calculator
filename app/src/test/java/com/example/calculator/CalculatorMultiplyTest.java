package com.example.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorMultiplyTest {

    @Test
    public void multiply_isCorrect() {
        // Arrange
        Calculator calculator = new Calculator();
        // Act
        int actualResult = calculator.multiply(1, 1);
        // Assert
        assertEquals(1, actualResult);
    }
}