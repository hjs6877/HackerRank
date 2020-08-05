package com.hackerrank.easy.implementation;

import java.util.Arrays;

import java.util.List;


import java.util.stream.Collectors;

public class BeautifulTriplets {
    public static void main(String[] args) {
        int d = 3;
        int[] arr = {1,6, 7, 7, 8, 10, 12, 13, 14, 19};
        int result = beautifulTriplets(d, arr);

        System.out.println(result);
    }

    private static int beautifulTriplets(int d, int[] arr) {
        Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        List<Integer> list = Arrays.stream(arr2).collect(Collectors.toList());

        int count = 0;

        for(Integer num : list){
            if(list.contains(num + d) && list.contains(num + (2 * d))){
                count++;
            }
        }

        return count;
    }
}
