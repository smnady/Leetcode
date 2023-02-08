package LeetCode.Easy.IntersectionOfTwoArraysII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static int[] intersect(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        List<Integer> list = new ArrayList<>();
        if (n1 < n2) {
            for (int i = 0; i < n1; i++) {
                boolean flag = false;
                for (int j = 0; j < n2; j++) {
                    if (nums1[i]==nums2[j]) {
                        list.add(nums1[i]);
                        nums2[j] = -1;
                        flag = true;
                    }
                    if (flag) break;
                }
            }
        }
        else {
            for (int i = 0; i < n2; i++) {
                boolean flag = false;
                for (int j = 0; j < n1; j++) {
                    if (nums2[i]==nums1[j]) {
                        list.add(nums2[i]);
                        nums1[j] = -1;
                        flag = true;
                    }
                    if (flag) break;
                }
            }
        }
        n1 = list.size();
        n2 = 0;
        int[] rez = new int[n1];
        for (Integer i : list) {
            rez[n2++] = i;
        }
        return rez;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {1,2,2,1};
        int[] arr2 = new int[] {2, 2};
        int[] arr3 = new int[] {4,9,5};
        int[] arr4 = new int[] {9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(arr1, arr2)));
        System.out.println(Arrays.toString(intersect(arr3, arr4)));
    }
}
