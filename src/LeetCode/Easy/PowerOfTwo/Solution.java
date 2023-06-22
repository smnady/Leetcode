package LeetCode.Easy.PowerOfTwo;

public class Solution {
    public static boolean isPowerOfTwo(int n) {
        int count = 0;
        while (n!=0) {
            count += n&1;
            n <<= 1;
            if (count > 1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 5;
        int z = n>>1;
        System.out.println(z);
    }
}
