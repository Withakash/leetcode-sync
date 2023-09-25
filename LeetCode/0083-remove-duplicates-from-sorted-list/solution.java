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
    public ListNode deleteDuplicates(ListNode head) {

        ListNode p = head;
        ListNode q ;
        if( head == null ||p.next == null )
        {
            return head;
        }
        q = p.next;
        while(q != null) 
        {
            if(p.val == q.val) {
                p.next = q.next;
                q = q.next;
            }else{
               p = p.next;
               q = q.next;
            }
    
        }

        return head;
        
    }
}
