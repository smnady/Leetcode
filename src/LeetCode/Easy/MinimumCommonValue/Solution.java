package LeetCode.Easy.MinimumCommonValue;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> st = new HashSet<>();
        for (int j : nums1) st.add(j);
        for (int i : nums2) if (st.contains(i)) return i;
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 2, 3};
        int[] arr2 = new int[] {2, 3, 4};
        System.out.println(getCommon(arr1,arr2));
    }
}
