package LeetCode.Easy.RemoveDuplicatesFromSortedList;

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
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        if (head==null) return head;
        while (current.next != null) {
            ListNode next = current.next;
            if (current.val==next.val) {
                if (next.next!=null)current.next = next.next;
                else current.next = null;
            }
            else current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(2);
        ListNode list2 = new ListNode(2);
        ListNode list3 = new ListNode(1, null);
        list1.next = list2;
        list2.next = list3;
        deleteDuplicates(list1);
        List<Integer> list = new ArrayList<>();
        ListNode current = list1;
        while (current!=null) {
            list.add(current.val);
            current = current.next;
        }
        System.out.println(list.toString());
    }
}
