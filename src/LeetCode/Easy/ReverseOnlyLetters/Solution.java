package LeetCode.Easy.ReverseOnlyLetters;

import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Solution {
    public static String reverseOnlyLetters(String s) {
        Set<Character> chars = new HashSet<>();
        String buf = "";
        String rez = "";
        for (int i = 65; i < 91; i++) chars.add((char) i);
        for (int i = 97; i < 123; i++) chars.add((char) i);
        for (int i = 0; i < s.length(); i++) if (chars.contains(s.charAt(i))) buf += s.charAt(i);
        int j = buf.length()-1;
        for (int i = 0; i < s.length(); i++) {
            if (!chars.contains(s.charAt(i))) rez += s.charAt(i);
            else rez += buf.charAt(j--);
        }
        return rez;
    }

    public static void main(String[] args) {
        String str = "ab-cd";
        String str2 = "a-bC-dEf-ghIj";
        String str3 = "Test1ng-Leet=code-Q!";
        System.out.println(reverseOnlyLetters(str) + "\n" + reverseOnlyLetters(str2) +"\n" + reverseOnlyLetters(str3));
    }
}
