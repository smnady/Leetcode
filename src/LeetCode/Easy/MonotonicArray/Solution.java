package LeetCode.Easy.MonotonicArray;

import java.util.Arrays;

public class Solution {
    public static boolean isMonotonic(int[] nums) {
        byte b = -1;
        if (nums.length<3) return true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]>nums[i-1]) {
                b = 1;
                break;
            } else if (nums[i]<nums[i-1]) {
                b = 0;
                break;
            }
        }
        if (b==-1) return true;
        for (int i = 1; i < nums.length; i++) {
            if (b==1 && nums[i]<nums[i-1]) return false;
            if (b==0 && nums[i]>nums[i-1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] test = {1,2,2,3};
        int[] test2 = {6,5,4,4};
        int[] test3 = {1,3,2};
        System.out.println(isMonotonic(test)+"\n"+isMonotonic(test2)+"\n"+isMonotonic(test3));
    }
}
