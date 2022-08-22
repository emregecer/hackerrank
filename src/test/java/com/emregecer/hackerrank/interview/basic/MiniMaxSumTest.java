package com.emregecer.hackerrank.interview.basic;

import com.emregecer.IOTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiniMaxSumTest extends IOTest {

    @Test
    public void case1() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        MiniMaxSum.miniMaxSum(integers);

        assertEquals(
                "10 14",
                outputStreamCaptor.toString().trim()
        );
    }

    @Test
    public void case2() {
        List<Integer> integers = Arrays.asList(7, 69, 2, 221, 8974);
        MiniMaxSum.miniMaxSum(integers);

        assertEquals(
                "299 9271",
                outputStreamCaptor.toString().trim()
        );
    }
}
