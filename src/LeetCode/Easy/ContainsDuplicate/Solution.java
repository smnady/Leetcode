package LeetCode.Easy.ContainsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Set<Integer> st = new HashSet<>();
        int j = 0, i = n/2;
        if (n%2==1) st.add(nums[n-1]);
        for (j = 0; j < n/2; j++) {
            if (st.contains(nums[j])) return true;
            else st.add(nums[j]);
            if (st.contains(nums[i])) return true;
            else st.add(nums[i++]);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,1};
        int[] arr2 = new int[] {1, 2, 3, 4};
        int[] arr3 = new int[] {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(arr) + " " + containsDuplicate(arr2) + " " + containsDuplicate(arr3));
    }
}
