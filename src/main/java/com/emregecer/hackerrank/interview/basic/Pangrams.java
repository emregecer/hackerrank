package com.emregecer.hackerrank.interview.basic;

import java.io.*;
import java.util.Locale;

public class Pangrams {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
        if (s == null) {
            return "Not pangram";
        }
        String sLow = s.toLowerCase(Locale.ENGLISH);

        return "abcdefghijklmnopqrstuvwxyz ".chars()
                .allMatch(c -> sLow.contains(String.valueOf((char) c))) ? "pangram" : "not pangram";
    }
}
