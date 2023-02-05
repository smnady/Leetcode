package LeetCode.Easy.CountOddNumbers;

public class Solution {
    public static int countOdds(int low, int high) {
        if (low%2==0 && high%2==0) {
            if (high-low==1) return 1;
            else return (high-low)/2;
        }
        else return (high-low)/2 + 1;
    }

    public static void main(String[] args) {
        System.out.println(countOdds(3, 7));
        System.out.println(countOdds(13, 18));
        System.out.println(countOdds(14, 18));
        System.out.println(countOdds(147, 199));
    }
}
