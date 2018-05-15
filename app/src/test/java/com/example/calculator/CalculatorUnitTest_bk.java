package com.example.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorUnitTest_bk {

    @Test
    public void บวกเลขได้อย่างถูกต้อง_ตัวอย่างหนึ่งบวกสองต้องได้สาม() {
        // Arrange
        Calculator calculator = new Calculator();
        // Act
        int actualResult = calculator.plus(1, 3);
        // Assert
        assertEquals(4, actualResult);
    }

}
