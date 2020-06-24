package com.hackerrank.easy.implementation;

public class KaprekarNumbers {
    public static void main(String[] args) {
        int p = 1;
        int q = 99999;

        kaprekarNumbers(p, q);
    }

    private static void kaprekarNumbers(int p, int q) {
        String kaprekarNumbers = "";
        for (long i = p; i <= q; i++) {
            String sq = String.valueOf(i * i);
            if (sq.length() % 2 != 0) {
                sq = "0" + sq;
            }
            String l = sq.substring(0, sq.length()/2);
            String r = sq.substring(sq.length()/2);

            if (i == (Long.parseLong(l) + Long.parseLong(r))) {
                kaprekarNumbers += i + " ";
            }
        }

        if (kaprekarNumbers.isEmpty()) {
            System.out.println("INVALID RANGE");
        } else {
            System.out.println(kaprekarNumbers);
        }
    }
}
