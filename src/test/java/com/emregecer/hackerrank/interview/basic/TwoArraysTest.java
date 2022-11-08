package com.emregecer.hackerrank.interview.basic;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.emregecer.hackerrank.interview.basic.TwoArrays.twoArrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoArraysTest {

    @Test
    public void test1() {
        assertEquals(
                twoArrays(10, List.of(2, 1, 3), List.of(7, 8, 9)),
                "YES"
        );

        assertEquals(
                twoArrays(5, List.of(1, 2, 2, 1), List.of(3, 3, 3, 4)),
                "NO"
        );
    }

    @Test
    public void test2() {
        assertEquals(
                twoArrays(10, List.of(7, 6, 8, 4, 2), List.of(5, 2, 6, 3, 1)),
                "NO"
        );
    }
}
