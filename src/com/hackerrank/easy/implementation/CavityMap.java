package com.hackerrank.easy.implementation;

import java.util.Arrays;

public class CavityMap {
    public static void main(String[] args) {
        String[] grid = {
                "2587673293641591333444922684212827282684185934985966568161623775844765869818231839655315139935283917",
                "8316367721984838592282693133446625341275338241466354524729424384615647514615523763198353549484986131",
                "7252931762992564114799667333186696451635689741575495455771175463552324516966676389939676451657782958",
                "3423178757955912336293888671466458213667535126241333862655795639293176796723725984641411384575336234"
        };
        String[] result = cavityMap(grid);

        Arrays.stream(result).forEach(System.out::println);
    }

    private static String[] cavityMap(String[] grid) {
        int p = 0;

        while (p < grid.length - 2) {
            String fr = grid[p];
            String sr = grid[p + 1];
            String tr = grid[p + 2];
            char X = 'X';
            for (int i = 0; i < sr.length(); i++) {
                if (i != 0 && i != sr.length() - 1) {
                    if (
                            (fr.charAt(i) != X && sr.charAt(i) > fr.charAt(i))
                                    && (tr.charAt(i) != X && sr.charAt(i) > tr.charAt(i))
                                    && (sr.charAt(i - 1) != X && sr.charAt(i) > sr.charAt(i - 1))
                                    && (sr.charAt(i + 1) != X) && sr.charAt(i) > sr.charAt(i + 1)) {
                        grid[p + 1] = grid[p + 1].substring(0, i) + X + grid[p + 1].substring(i + 1);
                    }
                }
            }

            p++;
        }
        return grid;
    }
}
