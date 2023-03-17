package LeetCode.Easy.ValidParentheses;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static boolean isValid(String s) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int n = list.size()-1;
            if (list.isEmpty() && (ch==']' || ch==')' || ch=='}')) return false;
            else if (ch=='(' || ch == '{' || ch == '[') list.add(ch);
            else if (ch==')' && list.get(n)!='(') return false;
            else if (ch=='}' && list.get(n)!='{') return false;
            else if (ch==']' && list.get(n)!='[') return false;
            else if (ch==')' && list.get(n)=='(') list.remove(n);
            else if (ch=='}' && list.get(n)=='{') list.remove(n);
            else if (ch==']' && list.get(n)=='[') list.remove(n);
        }
        if (list.isEmpty()) return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isValid("({})([]())"));
        System.out.println(isValid("[(]())(){()[()]}"));
    }
}
