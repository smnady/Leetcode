package LeetCode.Easy.AssignCookies;

import java.util.Arrays;

public class Solution {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int rez = 0, j = 0;
        for (int i = 0; i < g.length; i++) {
            while(j<s.length) {
                if (g[i]<=s[j++]) {
                    rez++;
                    break;
                }
            }
        }
        return rez;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3};
        int[] arr2 = new int[]{1,1};
        System.out.println(findContentChildren(arr1,arr2));
    }
}
