package LeetCode.Easy.SetMismatch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] rez = new int[2];
        Set<Integer> st = new HashSet<>();
        for (int i : nums) {
            if (st.contains(i)) {
                rez[0] = i;
            }
            st.add(i);
        }
        for (int i = 0; i <= st.size(); i++) {
            if (!st.contains(i+1)) {
                rez[1] = i+1;
                break;
            }
        }
        return rez;
    }

    public static void main(String[] args) {
        int[] arr = {2,2};
        int[] arr1 = {1,2,2,4};
        int[] arr2 = {3,2,3,4,6,5};
        System.out.println(Arrays.toString(findErrorNums(arr)));
        System.out.println(Arrays.toString(findErrorNums(arr1)));
        System.out.println(Arrays.toString(findErrorNums(arr2)));
    }
}
