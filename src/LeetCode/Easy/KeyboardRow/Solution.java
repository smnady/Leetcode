package LeetCode.Easy.KeyboardRow;

import java.util.*;

public class Solution {
    public static void fillSet(Set<Character> mySet, String word) {
        for (int i = 0; i < word.length(); i++) {
            mySet.add(word.charAt(i));
        }
    }
    public static String[] findWords(String[] words) {
        int n = words.length;
        List<String> myList = new ArrayList<>();
        Set<Character> line1 = new HashSet<>();
        Set<Character> line2 = new HashSet<>();
        Set<Character> line3 = new HashSet<>();
        fillSet(line1, "qwertyuiop");
        fillSet(line2, "asdfghjkl");
        fillSet(line3, "zxcvbnm");
        for (int i = 0; i < words.length; i++) {
            String s = words[i].toLowerCase();
            int k = 0, k2 = 0, k3 = 0;
            for (int j = 0; j < words[i].length(); j++) {
                char ch = s.charAt(j);
                if (line1.contains(ch)) {
                    k++;
                    continue;
                }
                if (line2.contains(ch)) {
                    k2++;
                    continue;
                }
                if (line3.contains(ch)) {
                    k3++;
                    continue;
                }
                if ((k>0 && k2>0) || (k>0 && k3>0) || (k2>0 && k3>0)) break;
            }
            if (k == words[i].length() || k2 == words[i].length() || k3 == words[i].length()) myList.add(words[i]);
        }
        String[] rez = new String[myList.size()];
        n = 0;
        for (String item : myList) {
            rez[n++] = item;
        }
        return rez;
    }

    public static void main(String[] args) {
        String[] arr = new String[] {"Hello","Alaska","Dad","Peace"};
        System.out.println(Arrays.toString(findWords(arr)));
    }
}
