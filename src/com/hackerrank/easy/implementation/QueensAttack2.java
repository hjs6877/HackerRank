package com.hackerrank.easy.implementation;

import java.util.HashMap;
import java.util.Map;

public class QueensAttack2 {
    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        int r_q = 4;
        int c_q = 3;
        int[][] obstacles = {{5, 5}, {4, 2}, {2, 3}};
        int result = queensAttack(n, k, r_q, c_q, obstacles);

        System.out.println(result);
    }

    private static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
        int attackPos = 0;
        Map<String, int[]> obstacleMap = new HashMap<>();
        for (int i = 0; i < obstacles.length; i++) {
            obstacleMap.put(String.valueOf(obstacles[i][0]) + obstacles[i][1], obstacles[i]);
        }

        for (int r = r_q; r <= n; r++) {
            for (int c = c_q; c >= 1; c--) {
                if (((r_q == r) && (c_q != c))) {
                    attackPos++;
                }

                if ((c_q == c) && (r_q != r)) {
                    attackPos++;
                }

                if ((r_q != r && c_q != c) && Math.abs(r_q - r) == Math.abs(c_q - c)) {
                    attackPos++;
                }
            }
        }

        for (int r = r_q; r <= n; r++) {
            for (int c = c_q + 1; c <= n; c++) {

                if (((r_q == r) && (c_q != c))) {
                    attackPos++;
                }

                if ((c_q == c) && (r_q != r)) {
                    attackPos++;
                }

                if ((r_q != r && c_q != c) && Math.abs(r_q - r) == Math.abs(c_q - c)) {
                    attackPos++;
                }
            }
        }


        for (int r = r_q - 1; r >= 1; r--) {
            for (int c = c_q; c >= 1; c--) {

                if (((r_q == r) && (c_q != c))) {
                    attackPos++;
                }

                if ((c_q == c) && (r_q != r)) {
                    attackPos++;
                }

                if ((r_q != r && c_q != c) && Math.abs(r_q - r) == Math.abs(c_q - c)) {
                    attackPos++;
                }
            }
        }

        for (int r = r_q - 1; r >= 1; r--) {
            for (int c = c_q + 1; c <= n; c++) {

                if (((r_q == r) && (c_q != c))) {
                    attackPos++;
                }

                if ((c_q == c) && (r_q != r)) {
                    attackPos++;
                }

                if ((r_q != r && c_q != c) && Math.abs(r_q - r) == Math.abs(c_q - c)) {
                    attackPos++;
                }
            }
        }

        return attackPos;
    }
}
