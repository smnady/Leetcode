package LeetCode.Medium.RemoveNthNodeFromEndOfList;

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
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int x = 1, t = size(head);
        if (n==t) return head.next;
        ListNode list = head;
        switch (n) {
            case 1:
                while (x != t - 1) {
                    list = list.next;
                    x++;
                }
                list.next = null;
                return head;
            case 2:
                while (x != t - 2) {
                    list = list.next;
                    x++;
                }
                ListNode l = list.next;
                list.next = l.next;
                return head;
            default:
                while (x != t - n) {
                    list = list.next;
                    x++;
                }
                ListNode next = list.next;
                list.next = next.next;
                return head;
        }
    }
    public static int size(ListNode head) {
        ListNode p = head;
        int i = 0;
        while (p!=null) {
            i++;
            p = p.next;
        }
        return i;
    }
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>();
        ListNode head = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l5.next = null; l4.next = l5; l3.next = l4; l2.next = l3; head.next = l2;
        ListNode t = head;
        while (t!=null) {
            test.add(t.val);
            t = t.next;
        }
        System.out.print("Input: ");
        System.out.println(test.toString());
        List<Integer> list = new ArrayList<>();
        ListNode p = removeNthFromEnd(head, 2);
        int i = 0;
        while (i!=size(head)) {
            i++;
            list.add(p.val);
            p = p.next;
        }
        System.out.println("Output: " + list.toString());
    }
}
