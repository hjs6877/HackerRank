package com.hackerrank.easy.implementation;

public class ChocolateFeast {
    public static void main(String[] args) {
        int n = 6;
        int c = 2;
        int m = 2;
        int result = chocolateFeast(n, c, m);

        System.out.println(result);
    }

    private static int chocolateFeast(int n, int c, int m) {
        int eCount = n / c;
        int sum = eCount;
        int remainWrappers = eCount;

        while (remainWrappers >= m) {
            sum += remainWrappers / m;
            remainWrappers = (remainWrappers / m) + remainWrappers % m;
        }
        return sum;
    }
}
