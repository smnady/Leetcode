package LeetCode.Easy.LinkedListCycle;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }
    public static boolean hasCycle(ListNode head) {
        Set<ListNode> st = new HashSet<>();
        ListNode p = head;
        while (p!=null) {
           if (st.contains(p)) return true;
           else st.add(p);
           p = p.next;
        }
        return false;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        System.out.println(hasCycle(head));
        ListNode l1 = new ListNode(221);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(5);
        l3.next = l1; l2.next = l3; l1.next = l2; head.next = l1;
        System.out.println(hasCycle(head));
    }
}
