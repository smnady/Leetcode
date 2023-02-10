package LeetCode.Medium.LongestPalindromicSubstring;

public class Solution {
    public static String longestPalindrome(String s) {
        int n = s.length();
        String str = "";
        if (n==1) return s;
        for (int i = 0; i<n; i++) {
            for (int j = n-1; j>=0; j--) {
                int k = (j-i)/2;
                boolean flag = true;
                if (s.charAt(i)==s.charAt(j)) {
                    if (j-i==1 && 2>str.length()) {
                        str = "";
                        str+=s.charAt(i);
                        str+=s.charAt(j);
                        break;
                    }
                    int x = j;
                    for (int c = i; c < i + k; ) {
                        for ( ; x>=i+k; x--) {
                            if (s.charAt(c)!=s.charAt(x)) {
                                flag = false;
                                break;
                            }
                            c++;
                        }
                        if (!flag) break;
                    }
                    if (!flag) continue;
                    if (flag && (j-i+1>=str.length())) {
                        str = "";
                        for (int y = i; y<=j; y++) str += s.charAt(y);
                        break;
                    }
                }
            }
        }
        return str;
    }

    public static void main(String[] args) {
        String s = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        String s2 = "babad";
        String s3 = "cbbd";
        System.out.println(longestPalindrome(s) + " " + longestPalindrome(s2)+ " " + longestPalindrome(s3));
    }
}
