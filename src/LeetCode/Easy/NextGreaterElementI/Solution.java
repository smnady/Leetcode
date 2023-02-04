package LeetCode.Easy.NextGreaterElementI;

import java.util.Arrays;

public class Solution {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int[] rez = new int[n];
        for (int i=0; i<n; i++) {
            boolean flag = false, flag2 = true;
            for (int j = 0; j<m; j++) {
                if (nums2[j]==nums1[i]) {
                    flag = true;
                }
                if (nums2[j]>nums1[i] && flag) {
                    rez[i]=nums2[j];
                    flag2 = false;
                    break;
                }
            }
            if (flag2) rez[i]=-1;
        }
        return rez;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {4,1,2};
        int[] arr2 = new int[] {1,3,4,2};
        int[] nums_1 = new int[] {2, 4};
        int[] nums_2 = new int[] {1, 2, 3, 4};
        System.out.println(Arrays.toString(nextGreaterElement(arr1, arr2)));
        System.out.println(Arrays.toString(nextGreaterElement(nums_1, nums_2)));
    }
}
