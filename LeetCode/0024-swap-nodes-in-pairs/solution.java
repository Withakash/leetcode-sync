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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode curr = dummy;

        while(curr.next != null && curr.next.next != null) {
            ListNode p1 = curr.next;
            ListNode p2 = curr.next.next;

            p1.next = p2.next;
            p2.next = p1;

            curr.next = p2;
            curr = p1;
        }

        return dummy.next;
    }
}
