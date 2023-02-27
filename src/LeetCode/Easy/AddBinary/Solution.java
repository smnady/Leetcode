package LeetCode.Easy.AddBinary;

public class Solution {
    public static String addBinary(String a, String b) {
        if (a.equals(b) && a.equals("1".repeat(a.length()))) return (a+"0");
        String rez = (a.length()>=b.length())? a:b;
        String min = (a.length()<b.length())? a:b;
        min = "0".repeat(rez.length()-min.length() + 1) + min;
        rez = "0" + rez;
        for (int i = min.length()-1; i >= 0; i--) {
            char r = rez.charAt(i), m = min.charAt(i);
            if ((r=='1' && m=='0') || (r=='0' && m=='1')) rez = rez.substring(0, i) + "1" + rez.substring(i+1);
            else if (r=='1' && m=='1') {
                int j = rez.lastIndexOf("0", i);
                String part = (j>=0)? "0".repeat(i-j):"0".repeat(i+1);
                if (j>=0)rez = rez.substring(0, j) + "1" + part + rez.substring(i+1);
                else rez = "1" + part + rez.substring(i+1);
            }
        }
        if (rez.charAt(0)=='0' && rez.length()>1) rez = rez.substring(1);
        return rez;
    }

    public static void main(String[] args) {
        String a =       "101000001001001"; //110101110011110111010
        String b = "110101001011101110001";
        System.out.println(addBinary(a,b));
    }
}
