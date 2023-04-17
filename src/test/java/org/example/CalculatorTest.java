package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        int result = calculator.add(2, 3);
        assertEquals(7, result);
    }

    @Test
    void subtract() {
        int result = calculator.subtract(2, 3);
        assertEquals(-1, result);
    }

    @Test
    void multiply() {
        int result = calculator.multiply(2, 3);
        assertEquals(6, result);
    }

    @Test
    void divide() {
        int result = calculator.divide(3, 3);
        assertEquals(1, result);
    }
}
