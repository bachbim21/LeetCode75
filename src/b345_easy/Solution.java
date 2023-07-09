package b345_easy;

import java.util.Arrays;

public class Solution {
    public String reverseVowels(String s) {
        char q[]= s.toCharArray();
        int start =0;
        int end = s.length()-1;
        String vowel = "ueoaiUEOAI";
        while (start < end){
            while (start < end && vowel.indexOf(q[start]) ==-1){
                start++;
            }
            while (start < end && vowel.indexOf(q[end]) ==-1){
                end--;
            }
            char t = q[start];
            q[start] = q[end];
            q[end] = t;

            start++;
            end--;
        }

        String answer = new String(q);
        return answer;
    }
}
