package b1207_easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        int count =1;
        Set<Integer> set = new HashSet<>();
        for (int i=1;i<arr.length;i++){
            if (arr[i] == arr[i-1]){
                count++;
            }
            else {
                if (set.contains(count)){
                    return false;
                }
                set.add(count);
                count =1;
            }
        }
        if (set.contains(count)){
            return false;
        }
        return true;
    }
}
