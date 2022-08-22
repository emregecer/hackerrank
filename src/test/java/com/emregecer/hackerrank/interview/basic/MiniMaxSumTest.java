package com.emregecer.hackerrank.interview.basic;

import com.emregecer.IOTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.emregecer.hackerrank.interview.basic.MiniMaxSum.miniMaxSum;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiniMaxSumTest extends IOTest {

    @Test
    public void case1() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        miniMaxSum(integers);

        assertEquals(
                "10 14",
                outputStreamCaptor.toString().trim()
        );
    }

    @Test
    public void case2() {
        List<Integer> integers = Arrays.asList(7, 69, 2, 221, 8974);
        miniMaxSum(integers);

        assertEquals(
                "299 9271",
                outputStreamCaptor.toString().trim()
        );
    }

    @Test
    public void case3() {
        List<Integer> integers = Arrays.asList(256741038, 623958417, 467905213, 714532089, 938071625);
        miniMaxSum(integers);

        assertEquals(
                "2063136757 2744467344",
                outputStreamCaptor.toString().trim()
        );
    }

    @Test
    public void case4() {
        List<Integer> integers = Arrays.asList(5, 5, 5, 5, 5);
        miniMaxSum(integers);

        assertEquals(
                "20 20",
                outputStreamCaptor.toString().trim()
        );
    }
}
