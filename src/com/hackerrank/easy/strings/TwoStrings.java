package com.hackerrank.easy.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TwoStrings {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";

        String result = twoStrings(s1, s2);

        System.out.println(result);
    }

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {

        Set<Character> set = s1.chars().mapToObj(ch -> Character.valueOf((char) ch)).collect(Collectors.toSet());

        for(char c : s2.toCharArray())
            if(set.contains(c))
                return "YES";

        return "NO";
    }
}
