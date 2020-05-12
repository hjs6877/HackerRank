package com.hackerrank.easy.implementation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class EqualizeTheArray {
    public static void main(String[] args) {
        int[] arr = {3, 3, 2, 1, 3};
        int min = equalizeArray(arr);

        System.out.println(min);
    }

    static int equalizeArray(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 1;
        for (int num : arr) {
            if (map.containsKey(num)) {
                int val = map.get(num) + 1;
                map.put(num, val);

                max = max < val ? val : max;
            } else {
                map.put(num, 1);
            }
        }

        return arr.length - max;
    }
}
