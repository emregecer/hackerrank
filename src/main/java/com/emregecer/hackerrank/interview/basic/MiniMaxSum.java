package com.emregecer.hackerrank.interview.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
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
        int greatest = arr.stream().reduce((a, b) -> a > b ? a : b)
                .orElseThrow(() -> new RuntimeException("Error"));
        int lowest = arr.stream().reduce((a, b) -> a < b ? a : b)
                .orElseThrow(() -> new RuntimeException("Error"));

        int miniSum = arr.stream()
                .filter(number -> number != greatest)
                .reduce(0, Integer::sum);

        int maxSum = arr.stream()
                .filter(number -> number != lowest)
                .reduce(0, Integer::sum);

        System.out.println(miniSum + " " + maxSum);
    }
}

