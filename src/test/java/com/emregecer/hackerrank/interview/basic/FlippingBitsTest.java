package com.emregecer.hackerrank.interview.basic;

import org.junit.jupiter.api.Test;

import static com.emregecer.hackerrank.interview.basic.FlippingBits.flippingBits;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlippingBitsTest {

    @Test
    public void testFlippingBits() {
        assertEquals(flippingBits(2147483647), 2147483648L);
        assertEquals(flippingBits(1), 4294967294L);
        assertEquals(flippingBits(0), 4294967295L);
    }
}
