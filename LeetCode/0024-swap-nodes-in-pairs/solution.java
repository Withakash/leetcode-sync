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
        ListNode res = new ListNode(-1);
        ListNode curr = res;
        curr.next = head;
        ListNode p1,p2;

        while(curr.next != null && curr.next.next != null) {
            p1 = curr.next;
            p2 = curr.next.next;

            p1.next = p2.next;
            p2.next = p1;

            curr.next = p2;
            curr = p1;
        }

        return res.next;
    }
}
