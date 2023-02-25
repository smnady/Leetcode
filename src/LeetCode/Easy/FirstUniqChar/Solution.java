package LeetCode.Easy.FirstUniqChar;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void updateMap(Map<Character,Integer> myMap, char ch) {
        if (!myMap.containsKey(ch)) myMap.put(ch, 1);
        else myMap.put(ch, myMap.get(ch) + 1);
    }
    public static int firstUniqChar(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) updateMap(mp, s.charAt(i));
        for (int i = 0; i < s.length(); i++)
            if (mp.get(s.charAt(i))==1) return i;
        return -1;
    }
    public static void main(String[] args) {
        String str = "leetcode", str2 = "loveleetcode";
        String str3 = "aabb";
        System.out.println(firstUniqChar(str) + " " + firstUniqChar(str2) + " " + firstUniqChar(str3));
    }
}
    /*  An alternative, faster solution:
    public void updateMap(Map<Character,Integer> myMap, char ch) {
        if (!myMap.containsKey(ch)) myMap.put(ch, 1);
        else myMap.put(ch, myMap.get(ch) + 1);
    }
    public int firstUniqChar(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) updateMap(mp, s.charAt(i));
        for (int i = 0; i < s.length(); i++)
            if (mp.get(s.charAt(i))==1) return i;
        return -1;
    }
    */