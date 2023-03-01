package LeetCode.Easy.NumberOfCommonFactors;

public class Solution {
    public static int commonFactors(int a, int b) {
        int min = Math.min(a, b);
        int k = 0;
        for (int i = 1; i <= min; i++) {
            if (a%i==0 && b%i==0) k++;
        }
        return k;
    }

    public static void main(String[] args) {
        System.out.println(commonFactors(12, 6));
        System.out.println(commonFactors(25, 30));
    }
}
