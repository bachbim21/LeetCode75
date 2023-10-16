package b1732_easy;

public class Solution {
    public int largestAltitude(int[] gain) {
        int s=0;
        int max = 0;
        for (int j : gain) {
            s += j;
            if (max < s) {
                max = s;
            }
        }
         return max;
    }
}
