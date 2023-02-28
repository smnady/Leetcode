package LeetCode.Easy.CountPairsOfSimilarStrings;

import java.util.*;

public class Solution {
    public static int similarPairs(String[] words) {
        int rez = 0;
        for (int i = 0; i < words.length; i++) {
            String[] values = words[i].split("");
            Set<String> st = new HashSet<String>(Arrays.asList(values));
            for (int j = i+1; j < words.length; j++) {
                boolean flag = true;
                String[] vals = words[j].split("");
                Set<String> set = new HashSet<String>(Arrays.asList(vals));
                for (String item : st) {
                    if (!set.contains(item)) {
                        flag = false;
                        break;
                    }
                }
                if (st.size()==set.size()&&flag) rez++;
            }
        }
        return rez;
    }

    public static void main(String[] args) {
        String[] str = new String[]{"aba","aabb","abcd","bac","aabc"};
        System.out.println(similarPairs(str));
    }
}
