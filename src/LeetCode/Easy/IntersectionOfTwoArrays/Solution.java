package LeetCode.Easy.IntersectionOfTwoArrays;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class Solution {
    public static int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        Set<Integer> nums = new HashSet<>();
        if (n < m)
            for (int i = 0; i < n; i++) {
                boolean flag = false;
                for (int j = 0; j < m; j++) {
                    if (nums1[i] == nums2[j]) {
                        nums.add(nums1[i]);
                        flag = true;
                    }
                    if (flag) break;
                }
            }
        else for (int i = 0; i < m; i++) {
            boolean flag = false;
            for (int j = 0; j < n; j++) {
                if (nums1[j] == nums2[i]) {
                    nums.add(nums1[j]);
                    flag = true;
                }
                if (flag) break;
            }
        }
        n = nums.size();
        m = 0;
        int[] rez = new int[n];
        for (int i : nums) {
            rez[m++] = i;
        }
        return rez;
    }

    public static void main(String[] args) {
        int arr1[] = new int[] {1,2,2,1};
        int arr2[] = new int[] {2,2};
        int arr3[] = new int[] {4,9,5};
        int arr4[] = new int[] {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(arr1, arr2)));
        System.out.println(Arrays.toString(intersection(arr3, arr4)));
    }
}
