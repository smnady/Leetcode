package LeetCode.Easy.CanMakeArithmeticProgressionFromSequence;

import java.util.Arrays;

public class Solution {
    public static boolean canMakeArithmeticProgression(int[] arr) {
            Arrays.sort(arr);
            int x = arr[0]-arr[1], n = arr.length;
            for (int i=1; i<n-1; i++) {
                if (arr[i]-arr[i+1]!=x) return false;
            }
            return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {4, 2, 6, 12, 8, 10, 18, 22, 16, 20, 14};
        int[] arr_2 = new int[] {1, 27, 31, 11, 4};
        System.out.println(canMakeArithmeticProgression(arr));
        System.out.println(canMakeArithmeticProgression(arr_2));
    }
}
