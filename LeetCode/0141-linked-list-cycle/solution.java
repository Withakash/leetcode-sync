/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
      ListNode pre = head;
      ListNode post = head;

      while(post != null && post.next != null)
      {
          pre = pre.next;
          post = post.next.next;
         if(pre == post ) return true;
      }
      return false;
    } 
}
