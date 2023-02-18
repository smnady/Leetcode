package LeetCode.Easy.MajorityElement;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i : nums) {
            if (mp.containsKey(i)) mp.put(i, (mp.get(i)+1));
            else mp.put(i, 1);
            if (mp.get(i)>(nums.length/2)) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {3, 1, 2, 3, 7, 3, 3, 3};
        System.out.println(majorityElement(arr));
    }
}
