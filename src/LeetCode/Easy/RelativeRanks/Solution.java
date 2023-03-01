package LeetCode.Easy.RelativeRanks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static String[] findRelativeRanks(int[] score) {
        int[] buf = Arrays.copyOf(score, score.length);
        Arrays.sort(buf);
        Map<Integer, String> mp = new HashMap<>();
        int j = 1;
        for (int i = buf.length-1; i >= 0; i--) {
            if (j==1) mp.put(buf[i], "Gold Medal");
            else if (j==2) mp.put(buf[i], "Silver Medal");
            else if (j==3) mp.put(buf[i], "Bronze Medal");
            else mp.put(buf[i], ""+j);
            j++;
        }
        String[] rez = new String[buf.length];
        for (int i = 0; i < score.length; i++) {
            rez[i] = mp.get(score[i]);
        }
        return rez;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int[] arr2 = {10,3,8,9,4};
        System.out.println(Arrays.toString(findRelativeRanks(arr)) + "\n" + Arrays.toString(findRelativeRanks(arr2)));
    }
}
