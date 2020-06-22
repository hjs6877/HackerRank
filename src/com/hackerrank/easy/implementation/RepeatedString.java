package com.hackerrank.easy.implementation;

public class RepeatedString {
    public static void main(String[] args) {
        String s = "a";
        long n = 1000000000000L;

        long result = repeatedString(s, n);

        System.out.println(result);
    }

    private static long repeatedString(String s, long n) {
        long q = n / s.length();
        int r = (int) (n % s.length());

        long qCount = s.chars().filter(c -> c == 'a').count();
        long rCount = s.substring(0, r).chars().filter(c -> c == 'a').count();

        return qCount * q + rCount;
    }
}
