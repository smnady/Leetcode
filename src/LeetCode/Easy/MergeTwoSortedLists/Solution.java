package LeetCode.Easy.MergeTwoSortedLists;

import java.util.ArrayList;
import java.util.List;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class Solution {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0, null);
        ListNode current = head;
        while (list1!=null && list2!=null) {
            if (list1.val<list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        if (list1 != null) current.next = list1;
        if (list2 != null) current.next = list2;
        return head.next;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(1);
        ListNode list11 = new ListNode(2);
        ListNode list12 = new ListNode(4, null);
        ListNode list21 = new ListNode(3);
        ListNode list22 = new ListNode(4, null);
        head1.next = list11; list11.next = list12;
        head2.next = list21; list21.next = list22;
        ListNode current = mergeTwoLists(head1, head2);
        List<Integer> l = new ArrayList<>();
        while (current!=null) {
            l.add(current.val);
            current=current.next;
        }
        System.out.println(l.toString());
    }
}
