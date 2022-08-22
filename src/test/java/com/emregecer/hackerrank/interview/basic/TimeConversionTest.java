package com.emregecer.hackerrank.interview.basic;

import org.junit.jupiter.api.Test;

import static com.emregecer.hackerrank.interview.basic.TimeConversion.timeConversion;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeConversionTest {

    @Test
    public void case1() {
        assertEquals(
                timeConversion("07:05:45PM"),
                "19:05:45"
        );
    }
}
