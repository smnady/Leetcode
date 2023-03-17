package LeetCode.Easy.IntersectionOfTwoLinkedLists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        List<ListNode> list1 = new ArrayList<>();
        List<ListNode> list2 = new ArrayList<>();
        ListNode l1 = headA;
        ListNode l2 = headB;
        while (l1!=null || l2!=null) {
            if (l1!=null){
                list1.add(l1);
                if (list2.contains(l1)) return l1;
                l1 = l1.next;
            }
            if (l2!=null) {
                list2.add(l2);
                if (list1.contains(l2)) return l2;
                l2 = l2.next;
            }
        }
        return null;
    }
}
