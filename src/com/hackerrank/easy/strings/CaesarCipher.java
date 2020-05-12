package com.hackerrank.easy.strings;

public class CaesarCipher {
    public static void main(String[] args) {
        String s = "www.abc.xy";

        int k = 87;
        String encryptedStr = caesarCipher(s, k);

        System.out.println(encryptedStr);
    }

    static String caesarCipher(String s, int k) {
        String encryptedStr = "";
        int rotate = k % 26;
        for (char c : s.toCharArray()) {
            if(Character.isAlphabetic(c)){
                if (Character.toUpperCase('z') - Character.toUpperCase(c) >= rotate) {
                    encryptedStr += (char) (c + rotate);
                } else if(c == Character.toUpperCase(c)){
                    encryptedStr += (char) (('A' - 1) + (rotate - (Character.toUpperCase('z') - c)));
                } else  {
                    encryptedStr += (char) (('a' - 1) + (rotate - ('z' - c)));
                }
            }else{
                encryptedStr += (char) c;
            }

        }
        return encryptedStr;
    }
}
