package com.emregecer.hackerrank.interview.basic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.emregecer.hackerrank.interview.basic.MatchingStrings.matchingStrings;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatchingStringsTest {

    @Test
    public void case1() {
        List<String> strings = Arrays.asList("aba", "baba", "aba", "xzxb");
        List<String> queries = Arrays.asList("aba", "xzxb", "ab");

        assertEquals(matchingStrings(strings, queries), Arrays.asList(2, 1, 0));
    }

    @Test
    public void case2() {
        List<String> strings = Arrays.asList("def", "de", "fgh");
        List<String> queries = Arrays.asList("de", "lmn", "fgh");

        assertEquals(matchingStrings(strings, queries), Arrays.asList(1, 0, 1));
    }

    @Test
    public void case3() {
        List<String> strings = Arrays.asList(
                "abcde",
                "sdaklfj",
                "asdjf",
                "na",
                "basdn",
                "sdaklfj",
                "asdjf",
                "na",
                "asdjf",
                "na",
                "basdn",
                "sdaklfj",
                "asdjf"
        );
        List<String> queries = Arrays.asList("abcde", "sdaklfj", "asdjf", "na", "basdn");

        assertEquals(matchingStrings(strings, queries), Arrays.asList(1, 3, 4, 3, 2));
    }
}
