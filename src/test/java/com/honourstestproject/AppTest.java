package com.honourstestproject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {

    BasicMath math = new BasicMath();

    @Test
    void testAdd() {
        assertEquals(2, math.add(1, 1));
    }

    @Test
    void testSubtract() {
        assertEquals(1, math.subtract(2, 1));
    }

    @Test
    void testMultiply() {
        assertEquals(4, math.multiply(2, 2));
    }

    @Test
    void testDivide() {
        assertEquals(2, math.divide(4, 2));
    }

    // @Test
    // void failTest() {
    // assertEquals(1, 2);
    // }
}
