package LeetCode.Easy.LargestPerimeterTriangle;

import java.util.Arrays;

public class Solution {
    public static int largestPerimeter(int[] nums) {
        int n = nums.length,l = n-1;
        Arrays.sort(nums);
        for (int i=0; i<n/2; i++) {
            int x = nums[l];
            nums[l] = nums[i];
            nums[i] = x;
            l--;
        }
        for (int i=0; i<n-2; i++)
            for (int j=i+2; j<n; j++)
                if ((nums[i]+nums[i+1])>nums[j] && (nums[j]+nums[i+1])>nums[i] && (nums[i]+nums[j])>nums[i+1]) return nums[i]+nums[j]+nums[i+1];
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,1,10};
        int[] arr_2 = new int[] {3,2,3,4};
        System.out.println(largestPerimeter(arr));
        System.out.println(largestPerimeter(arr_2));
    }
}
