package LeetCode.Easy.DegreeOfAnArray;

import java.util.*;

public class Solution {
    public static int findShortestSubArray(int[] nums) {
        Set<Integer> st = new HashSet<>();
        Map<Integer,Integer> mp = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int max = 0, min = Integer.MAX_VALUE;
        for (int i : nums) {
            list.add(i);
            st.add(i);
            updateMap(mp, i);
            if (mp.get(i)>max) max = mp.get(i);
        }
        for (int i : st) {
            int x = list.indexOf(i), y = list.lastIndexOf(i);
            if (mp.get(i)==max && y-x+1<min) min = y-x+1;
        }
        return min;
    }
    public static void updateMap(Map<Integer, Integer> map, int x) {
        if (!map.containsKey(x)) map.put(x, 1);
        else map.put(x, map.get(x)+1);
    }

    public static void main(String[] args) {
        int[] arr = {49999,100,2,100,100,4,100};
        int[] arr2 = {1,2,2,1,2,1,1,1,1,2,2,2};
        int[] arr3 = {1,3,2,2,3,1};
        System.out.println(findShortestSubArray(arr)+ "\n" + findShortestSubArray(arr2) + "\n" + findShortestSubArray(arr3));
    }
}
