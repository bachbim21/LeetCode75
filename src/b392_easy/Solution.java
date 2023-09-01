package b392_easy;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() ==0) return true;
        int indexT =0;
        int indexS =0;
        while (indexT < t.length()){
            if (s.charAt(indexS) == t.charAt(indexT)){
                indexS++;
                if (indexS == s.length()){
                    return true;
                }
            }
            indexT ++;
        }
        return false;
    }
}
