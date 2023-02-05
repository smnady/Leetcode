package LeetCode.Medium.LongestSubstringWithoutRepeatingCharacters;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), rez = 1;
        if (s.equals("")) return 0;
        if (n==1) return rez;
        for (int i = 0; i < n; i++) {
            String str = "";
            int k = 1;
            boolean flag = true;
            str += s.charAt(i);
            for (int j = i+1; j < n; j++) {
                for (int p = 0; p < str.length(); p++) {
                    if (str.charAt(p)==s.charAt(j)) flag = false;
                }
                if (flag) {
                    str+=s.charAt(j);
                    k++;
                }
                if (!flag) break;
            }
            if (k>rez) rez = k;
        }
        return rez;
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        String s4 = "";
        System.out.println(lengthOfLongestSubstring(s1));
        System.out.println(lengthOfLongestSubstring(s2));
        System.out.println(lengthOfLongestSubstring(s3));
        System.out.println(lengthOfLongestSubstring(s4));
    }
}
