package LeetCode.Easy.FairCandySwap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        Set<Integer> st1 = new HashSet<>();
        Set<Integer> st2 = new HashSet<>();
        int[] rez = new int[2];
        int sum1 = 0, sum2 = 0, medium = 0;
        for (int i = 0; i < aliceSizes.length; i++) {
            st1.add(aliceSizes[i]);
            sum1+=aliceSizes[i];
        }
        for (int i = 0; i < bobSizes.length; i++) {
            st2.add(bobSizes[i]);
            sum2+=bobSizes[i];
        }
        medium = (sum1+sum2)/2;
        for (Integer i : st1) {
            int x = medium - (sum1-i);
            if (st2.contains(x) && sum2-x+i==medium) {
                rez[0] = i;
                rez[1] = x;
            }
        }
        return rez;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2};
        int[] arr2 = {2, 3};
        System.out.println(Arrays.toString(fairCandySwap(arr1, arr2)));
    }
}
