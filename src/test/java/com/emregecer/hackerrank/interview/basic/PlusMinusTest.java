package com.emregecer.hackerrank.interview.basic;

import com.emregecer.IOTest;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlusMinusTest extends IOTest {

    @Test
    public void case1() {
        List<Integer> integers = List.of(-4, 3, -9, 0, 4, 1);
        PlusMinus.plusMinus(integers);

        assertEquals(
                String.join("0.500000", "0.333333", "0.166667"),
                outputStreamCaptor.toString().trim()
        );
    }

    @Test
    public void case2() {
        List<Integer> integers = List.of(1, 2, 3, -1, -2, -3, 0, 0);
        PlusMinus.plusMinus(integers);

        assertEquals(
                String.join(System.getProperty("line.separator"), "0.375000", "0.375000", "0.250000"),
                outputStreamCaptor.toString().trim()
        );
    }
}
