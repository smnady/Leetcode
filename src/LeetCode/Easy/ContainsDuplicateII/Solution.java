package LeetCode.Easy.ContainsDuplicateII;

import javafx.scene.effect.SepiaTone;

import java.util.*;

import static java.util.Collections.list;

public class Solution {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && Math.abs(i-map.get(nums[i]))<=k) return true;
            else map.put(nums[i], i);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,1};
        int[] arr2 = {1,2,3,1,2,3};
        int[] arr3 = {1,2,3,1,2,3,3};
        System.out.println(containsNearbyDuplicate(arr1, 3));
        System.out.println(containsNearbyDuplicate(arr2, 2));
        System.out.println(containsNearbyDuplicate(arr3, 2));
    }
}
