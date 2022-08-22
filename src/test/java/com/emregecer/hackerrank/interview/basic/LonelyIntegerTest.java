package com.emregecer.hackerrank.interview.basic;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.emregecer.hackerrank.interview.basic.LonelyInteger.lonelyinteger;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LonelyIntegerTest {

    @Test
    public void case1() {
        List<Integer> array = List.of(1, 2, 3, 4, 3, 2, 1);

        assertEquals(lonelyinteger(array), 4);
    }

    @Test
    public void case2() {
        List<Integer> array = List.of(1);

        assertEquals(lonelyinteger(array), 1);
    }

    @Test
    public void case3() {
        List<Integer> array = List.of(1, 1, 2);

        assertEquals(lonelyinteger(array), 2);
    }

    @Test
    public void case4() {
        List<Integer> array = List.of(1, 1, 2);

        assertEquals(lonelyinteger(array), 2);
    }

    @Test
    public void case5() {
        List<Integer> array = List.of(0, 0, 1, 2, 1);

        assertEquals(lonelyinteger(array), 2);
    }
}
