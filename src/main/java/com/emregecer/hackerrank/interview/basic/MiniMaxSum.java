package com.emregecer.hackerrank.interview.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MiniMaxSum {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        miniMaxSum(arr);

        bufferedReader.close();
    }

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        List<Long> longList = arr.stream()
                .map(number -> Long.valueOf(String.valueOf(number)))
                .sorted()
                .collect(toList());

        long maxSum = longList.stream()
                .skip(1)
                .reduce(Long::sum)
                .orElseThrow(() -> new RuntimeException("Error"));

        long minSum = longList.stream()
                .limit(longList.size() - 1)
                .reduce(Long::sum)
                .orElseThrow(() -> new RuntimeException("Error"));

        System.out.println(minSum + " " + maxSum);
    }
}

