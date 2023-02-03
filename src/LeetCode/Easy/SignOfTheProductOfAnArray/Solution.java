package LeetCode.Easy.SignOfTheProductOfAnArray;

public class Solution {
    public static int arraySign(int[] nums) {
        int n = nums.length, rez = 1;
        for (int i = 0; i<n; i++) {
            if (nums[i]==0) return 0;
            else if (nums[i]<0) rez*=-1;
        }
        return rez;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {-1,-2,-3,-4,3,2,1};
        int[] arr_2 = new int[] {1,5,0,2,-3};
        int[] arr_3 = new int[] {-1,1,-1,1,-1};
        System.out.println(arraySign(arr));
        System.out.println(arraySign(arr_2));
        System.out.println(arraySign(arr_3));
    }
}
