package LeetCode.Easy.SingleNumber;

import java.util.*;

public class Solution {
    public static void updateMap(Map<Integer, Integer> map, int x) {
        if (!map.containsKey(x)) map.put(x, 1);
        else map.put(x, map.get(x)+1);
    }
    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i : nums) {
            updateMap(mp, i);
        }
        for (Integer key : mp.keySet()) if (mp.get(key)==1) return key;
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 2, 2, 1, 4, 3};
        System.out.println(singleNumber(arr));
    }
}
