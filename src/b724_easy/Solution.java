package b724_easy;

public class Solution {
    public int pivotIndex(int[] nums) {
        int sL = 0, sR =0;
        for (int i : nums){
            sR += i;
        }

        for (int i =0;i<nums.length;i++){
            int sC = nums[i];
            sR -= sC;
            if (sL == sR){
                return i;
            }
            sL += sC;
        }
        return -1;
    }
}
