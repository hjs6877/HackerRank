package com.hackerrank.easy.implementation;

public class ACMICPCTeam {
    public static void main(String[] args) {
        String[] topic = {"10101", "11100", "11010", "00101"};
        int[] result = acmTeam(topic);

        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    static int[] acmTeam(String[] topic){
        int maxTopic = 0;
        int maxTeam = 0;

        for (int i = 0; i < topic.length - 1; i++) {
            for(int j = i + 1; j < topic.length; j++){
                int mtpCount = 0;
                String t1 = topic[i];
                String t2 = topic[j];

                for(int k = 0; k < t1.length(); k++){
                    if (t1.charAt(k) == '1' || t2.charAt(k) == '1') {
                        mtpCount++;
                    }
                }

                if (maxTopic == mtpCount) {
                    maxTeam++;
                } else if( maxTopic < mtpCount){
                    maxTeam = 1;
                    maxTopic = mtpCount;
                }
            }



        }
        return new int[]{maxTopic, maxTeam};
    }
}
