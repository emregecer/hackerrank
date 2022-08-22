package com.emregecer.hackerrank.interview.basic;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.emregecer.hackerrank.interview.basic.MatchingStrings.matchingStrings;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatchingStringsTest {

    @Test
    public void case1() {
        List<String> strings = List.of("aba", "baba", "aba", "xzxb");
        List<String> queries = List.of("aba", "xzxb", "ab");

        assertEquals(matchingStrings(strings, queries), List.of(2, 1, 0));
    }

    @Test
    public void case2() {
        List<String> strings = List.of("def", "de", "fgh");
        List<String> queries = List.of("de", "lmn", "fgh");

        assertEquals(matchingStrings(strings, queries), List.of(1, 0, 1));
    }

    @Test
    public void case3() {
        List<String> strings = List.of(
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
        List<String> queries = List.of("abcde", "sdaklfj", "asdjf", "na", "basdn");

        assertEquals(matchingStrings(strings, queries), List.of(1, 3, 4, 3, 2));
    }
}
