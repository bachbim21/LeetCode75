package b3_longestSubString;

import java.util.HashSet;
import java.util.Set;

public class solution2 {
    public int lengthOfLongestSubstring(String s) {
        int max = 0, start = 0 ;
        Set<String> a = new HashSet<>();
        for (int end = 0; end< s.length();end++){
            if(a.contains(s.charAt(end))){
                a.remove(s.charAt(end));
                start++;
                end--;
            }
            else {
                a.add(String.valueOf(s.charAt(end)));
                max = Math.max(max,a.size());
            }
        }
        return max;
    }
}
