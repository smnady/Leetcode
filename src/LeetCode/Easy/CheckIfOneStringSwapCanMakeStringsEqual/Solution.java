package LeetCode.Easy.CheckIfOneStringSwapCanMakeStringsEqual;

public class Solution {
    public static boolean areAlmostEqual(String s1, String s2) {
        int k = 0, n = s1.length(), j = 0;
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i)!=s2.charAt(i)) k++;
        }
        if (k>2) return false;
        char[] ch1 = new char[2];
        char[] ch2 = new char[2];
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i)!=s2.charAt(i)) {
                ch1[j] = s1.charAt(i);
                ch2[j] = s2.charAt(i);
                j++;
            }
        }
        if (ch1[0]==ch2[1] && ch1[1]==ch2[0]) return true;
        else return false;
    }

    public static void main(String[] args) {
        String s1 = "bank", s2 = "kanb";
        String str1 = "attack", str2 = "defend";
        System.out.println(areAlmostEqual(s1, s2));
        System.out.println(areAlmostEqual(str1, str2));
    }
}
