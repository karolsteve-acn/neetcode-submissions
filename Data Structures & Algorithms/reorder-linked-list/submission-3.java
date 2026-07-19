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
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow.next;
        slow.next = null;

        ListNode rev = null;
        while(mid != null) {
            ListNode tmp = mid.next;
            mid.next = rev;
            rev = mid;
            mid = tmp;
        }

        while(head != null && rev != null) {
            ListNode tmp = head.next;
            ListNode tmp2 = rev.next;

            rev.next = head.next;
            head.next = rev;
            head = tmp;
            rev = tmp2;
        }
    }
}
