package LeetCode.Easy.CountDistinctNumbersOnBoard;

public class Solution {
    public static int distinctIntegers(int n) {
        if (n==1) return 1;
        return n-1;
    }
    public static void main(String[] args) {
        System.out.println(distinctIntegers(5));
    }
}
