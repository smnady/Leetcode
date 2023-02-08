package LeetCode.Medium.IntegerToRoman;

public class Solution {
    public static String intToRoman(int num) {
        String[] str = new String[] {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String s = "";
        int[] nums = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        for (int i = 0; i < 13; i++) {
            while (num>=nums[i]) {
                s += str[i];
                num -= nums[i];
            }
        }
        return s;
    }
    public static void main(String[] args) {
        int a = 58, b = 1994, c = 49;
        System.out.println(a + " - " + intToRoman(a));
        System.out.println(b + " -" + intToRoman(b));
        System.out.println(c + " - " + intToRoman(c));
    }
}
