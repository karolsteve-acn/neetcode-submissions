/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ListNode middle = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null) {
            middle = middle.next;
            fast = fast.next.next;
        }
        ListNode rhs = middle.next;
        middle.next = null;
        ListNode lhs = head;
        // reverse rhs
        ListNode prev = null;
        ListNode curr = rhs;
        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        while(prev != null) {
            ListNode tmp1 = lhs.next;
            ListNode tmp2 = prev.next;
            lhs.next = prev;
            prev.next = tmp1;
            lhs = tmp1;
            prev = tmp2;
        }
    }
}
