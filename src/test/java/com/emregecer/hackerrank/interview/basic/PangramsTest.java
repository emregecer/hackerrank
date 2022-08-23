package com.emregecer.hackerrank.interview.basic;

import org.junit.jupiter.api.Test;

import static com.emregecer.hackerrank.interview.basic.Pangrams.pangrams;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PangramsTest {

    @Test
    public void case1() {
        assertEquals(pangrams("We promptly judged antique ivory buckles for the next prize"), "pangram");
    }

    @Test
    public void case2() {
        assertEquals(pangrams("We promptly judged antique ivory buckles for the prize"), "not pangram");
    }

    @Test
    public void case3() {
        assertEquals(pangrams("The quick brown fox jumps over the lazy dog"), "pangram");
    }


}
