package LeetCode.Medium.ReverseInteger;

public class Solution {
    public static int reverse(int x) {
        String s = "", rez = "";
        if (x<0) {
            x*= -1;
            s+= x + "-";
            for (int i = s.length()-1; i>=0; i--) rez += s.charAt(i);
        }
        else {
            s += x;
            for (int i = s.length()-1; i>=0; i--) rez += s.charAt(i);
        }
        try {
            x = Integer.parseInt(rez);
        } catch (Exception ex) {
            return 0;
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
    }
}
