package LeetCode.Easy.MissingNumber;

import java.util.Arrays;

public class Solution {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, j = n-1;
        if (n==1 && nums[0]==1) return 0;
        if (n==1 && nums[0]==0) return 1;
        for (int i = 0; i<n; i++) {
            if (nums[i]!=i) return i;
            if (nums[j]!=j && nums[j-1]!=j) return j;
            j--;
        }
        return n;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {3, 0, 1};
        int[] arr2 = new int[] {9,6,4,2,3,5,7,0,1};
        int[] arr3 = new int[] {0, 1};
        System.out.println(missingNumber(arr) + " " + missingNumber(arr2) + " " + missingNumber(arr3));
    }
}
