package com.hackerrank.easy.strings;

import java.util.HashMap;
import java.util.Map;

public class MakingAnagrams {
    public static void main(String[] args) {
        String s1 = "cde";
        String s2 = "abc";

        int result = makingAnagrams(s1, s2);

        System.out.println(result);
    }

    private static int makingAnagrams(String s1, String s2) {
        Map<Character, Integer> s1Map = getSMap(s1);
        Map<Character, Integer> s2Map = getSMap(s2);


        // 알파벳 배열로 두 map을 비교하자.
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int delCount = 0;
        for (char ch : alphabet.toCharArray()) {
            if (s1Map.get(ch) == null && s2Map.get(ch) != null) {
                delCount = delCount + s2Map.get(ch);
            }

            if (s1Map.get(ch) != null && s2Map.get(ch) == null) {
                delCount = delCount + s1Map.get(ch);
            }

            if (s1Map.get(ch) != null && s2Map.get(ch) != null) {
                if (s1Map.get(ch) != s2Map.get(ch)) {
                    delCount = delCount + (Math.abs(s1Map.get(ch) - s2Map.get(ch)));
                }
            }

        }
        return delCount;
    }

    private static Map<Character, Integer> getSMap(String s) {
        Map<Character, Integer> sMap = new HashMap<>();

        for(char c : s.toCharArray()){
            if (sMap.containsKey(c)) {
                sMap.put(c, sMap.get(c) + 1);
            } else {
                sMap.put(c, 1);
            }
        }
        return sMap;
    }
}
