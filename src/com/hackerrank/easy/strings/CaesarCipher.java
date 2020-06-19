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
            if(!Character.isLetter(c))
                encryptedStr += (char) c;
            else {
                if (Character.toUpperCase('z') - Character.toUpperCase(c) >= rotate) {
                    encryptedStr += (char) (c + rotate);
                } else {
                    char base = Character.isLowerCase(c) ? 'a' : 'A';
                    char endBase = Character.isLowerCase(c) ? 'z' : 'Z';

                    encryptedStr += (char) ((base - 1) + (rotate - (endBase - c)));
                }
            }

        }
        return encryptedStr;
    }
}
