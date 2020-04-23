package com.hackerrank.easy;

import java.nio.charset.CharacterCodingException;
import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPassword {
    public static void main(String[] args) {
        String password = "#HackerRan";
        int answer = minimumNumber(password.length(), password);

        System.out.println(answer);;
    }

    static int minimumNumber(int n, String password) {
        String SPECIAL_CHARACTERS = "!@#$%^&*()\\\\-+]+.*";
        int restNumberCount = 6 - n;
        int needCount = 4;

        IntPredicate[] predicates = new IntPredicate[]{
                ch -> Character.isDigit((char) ch),
                ch -> Character.isLowerCase((char) ch),
                ch -> Character.isUpperCase((char) ch),
                ch -> SPECIAL_CHARACTERS.indexOf((char) ch) != -1
        };

        for(IntPredicate predicate : predicates)
            if(password.chars().anyMatch(predicate))
                needCount--;

        return Math.max(needCount, restNumberCount);
    }
}
