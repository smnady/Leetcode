package LeetCode.Medium.SwapNodesInPairs;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode swapPairs(ListNode head) {
        if (head==null || head.next==null) return head;
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode current = temp;
        while (current.next!=null && current.next.next!=null) {
            ListNode first = current.next.next;
            ListNode second = current.next;
            second.next = first.next;
            current.next = first;
            current.next.next = second;
            current = current.next.next;
        }
        return temp.next;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        l6.next = null; l5.next = l6; l4.next=l5; l3.next = l4; l2.next = l3; head.next = l2;
        ListNode p = head;
        List<Integer> list = toList(p);
        System.out.println("Input: " + list.toString());
        p = swapPairs(head);
        List<Integer> list2 = toList(p);
        System.out.println("Output: " + list2.toString());
    }
    public static List<Integer> toList(ListNode head) {
        ListNode p = head;
        List<Integer> l = new ArrayList<>();
        while (p!=null) {
            l.add(p.val);
            p = p.next;
        }
        return l;
    }
}
