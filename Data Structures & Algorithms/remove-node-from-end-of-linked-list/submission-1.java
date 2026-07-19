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
    public ListNode removeNthFromEnd(ListNode head, int n) {
ListNode torch = new ListNode(0, head);
        ListNode toRemove = torch;
        ListNode curr = toRemove;
        for(int i = 0; i< n; i++)  torch = torch.next;
        while(torch != null && torch.next != null) {
            curr = curr.next;
            torch = torch.next;
        }
        curr.next = curr.next == null ? null : curr.next.next;
        return toRemove.next;
    }
}
