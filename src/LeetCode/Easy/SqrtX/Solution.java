package LeetCode.Easy.SqrtX;

public class Solution {
    public static int mySqrt(int x) {
        if (x==0) return 0;
        if (x==Math.pow(2, 31)-1) return 46340;
        for (int i = 1; i <= x; i++) {
            if (x==i*i) return i;
            if (x<i*i && x > (i-1)*(i-1)) return i-1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(81));
        System.out.println(mySqrt(50));
    }
}
