package com.hackerrank.easy.strings;

public class CamelCase {
    public static void main(String[] args) {
        String s = "saveChangesInTheEditor";
        int result = camelcase(s);

        System.out.println(result);
    }

    static int camelcase(String s) {
        if(s == null || s.isEmpty())
            return 0;

        int count = 1;
        for(int i = 0; i < s.length(); i++){
            String str = Character.toString(s.charAt(i));
            if(str == str.toUpperCase())
                count++;
        }
        return count;
    }
}
