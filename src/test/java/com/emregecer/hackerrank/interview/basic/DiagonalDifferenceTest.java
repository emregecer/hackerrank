package com.emregecer.hackerrank.interview.basic;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.emregecer.hackerrank.interview.basic.DiagonalDifference.diagonalDifference;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiagonalDifferenceTest {

    @Test
    public void case1() {
        List<List<Integer>> array = List.of(
                List.of(11, 2, 4),
                List.of(4, 5, 6),
                List.of(10, 8, -12)
        );

        assertEquals(diagonalDifference(array), 15);
    }
}
