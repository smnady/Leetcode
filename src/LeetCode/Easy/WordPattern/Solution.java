package LeetCode.Easy.WordPattern;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static boolean wordPattern(String pattern, String s) {
        int i = 0, j = 0, k = 1;
        Map<Character, String> myMap = new HashMap<>();
        for (i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String val = "";
            while (j < s.length() && s.charAt(j)!=' ') {
                val += s.charAt(j++);
            }
            if (j < s.length() && s.charAt(j)==' ') k++;
            j++;
            if (!myMap.containsKey(ch) && myMap.containsValue(val)) return false;
            else if (!myMap.containsKey(ch)) myMap.put(ch, val);
            else if (!myMap.get(ch).equals(val)) return false;
        }
        if (j<s.length() || k!=pattern.length()) return false;
        return true;
    }

    public static void main(String[] args) {
        String pat = "abba", str = "dog cat cat dog";
        String pat2 = "abba", str2 = "dog cat cat cat";
        String pat3 = "abba", str3 = "cat cat cat cat";
        String pat4 = "", str4 = "cat cat cat cat";
        System.out.println(wordPattern(pat, str));
        System.out.println(wordPattern(pat2, str2));
        System.out.println(wordPattern(pat3, str3));
        System.out.println(wordPattern(pat4, str4));
    }
}
