package LeetCode.Easy.SummaryRanges;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            String s = "";
            int j = i;
            while(j+1<n && nums[j]+1==nums[j+1]) {
                j++;
            }
            if (j!=i) list.add(s+nums[i]+"->"+nums[j]);
            else list.add(s+nums[i]);
            i=j;
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {0,1,2,4,5,7};
        System.out.println(summaryRanges(arr));
    }
}
