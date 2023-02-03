package LeetCode.Easy.ClimbingStars;

public class Solution {
    public static int climbStairs(int n) {
        int[] arr = new int[46];
        arr[0] = 1;
        arr[1] = 2;
        for(int i = 2; i < 46; i++) arr[i] = arr[i-1] + arr[i-2];
        return arr[n-1];
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
        System.out.println(climbStairs(44));
    }
}
