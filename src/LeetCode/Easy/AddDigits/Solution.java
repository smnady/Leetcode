package LeetCode.Easy.AddDigits;

public class Solution {
    public static int addDigits(int num) {
        int x = 0;
        while (true){
            if (num/10==0) return num;
            while (num > 0) {
                x += num%10;
                num/=10;
            }
            num = x;
            x = 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }
}
