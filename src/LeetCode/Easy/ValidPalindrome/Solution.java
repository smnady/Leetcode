package LeetCode.Easy.ValidPalindrome;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        Set<Character> st = new HashSet<>();
        for (int i = 97; i < 123; i++) st.add((char)i);
        for (int i = 48; i < 58; i++) st.add((char)i);
        StringBuilder strb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (st.contains(ch)) strb.append(ch);
        }
        s = strb.toString();
        return strb.reverse().toString().equals(s);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
