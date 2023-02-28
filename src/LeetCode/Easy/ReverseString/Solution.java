package LeetCode.Easy.ReverseString;

import java.util.Arrays;

public class Solution {
    public static void reverseString(char[] s) {
        for (int i = 0; i<s.length/2; i++) {
            char ch = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = ch;
        }
    }

    public static void main(String[] args) {
        char[] arr = new char[]{'h','e','l','l','o'};
        char[] arr2 =new char[]{'H','a','n','n','a','h'};
        reverseString(arr);
        reverseString(arr2);
        System.out.println(Arrays.toString(arr) + "\n" + Arrays.toString(arr2));
    }
}
