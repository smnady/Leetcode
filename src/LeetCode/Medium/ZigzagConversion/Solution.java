package LeetCode.Medium.ZigzagConversion;

public class Solution {
    public static String convert(String s, int numRows) {
        String rez = "";
        int val = (numRows-1)*2, val2 = 0;
        if (numRows==1 || numRows>=s.length()) return s;
        for (int i = 0; i < numRows; i++) {
            rez+=s.charAt(i);
            for (int j = i; j < s.length(); ) {
                boolean flag = false, fl = false;
                if (val!=0 && j+val<s.length()) {
                    j+=val;
                    rez+=s.charAt(j);
                    flag = true;
                }
                if (val2!=0 && (flag || val==0) && j+val2<s.length()) {
                    j+=val2;
                    rez+=s.charAt(j);
                    fl = true;
                }
                if (fl && val2+j>=s.length() && val+j<s.length()) {
                    j+=val; rez+=s.charAt(j);
                }
                if (val+j>=s.length() || val2+j>=s.length()) break;
            }
            if (val!=0) {
                val -= 2;
                val2 += 2;
            } else {
                val = (numRows-1)*2;
                val2 = 0;
            }
        }
        return rez.substring(0, s.length());
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
        System.out.println(convert("PAYPALISHIRING", 5));
        System.out.println(convert("ABCDE", 4));
    }
}