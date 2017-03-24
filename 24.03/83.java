/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode h = head;
        
        while (h!=null) {
            while (h.next!=null && h.val==h.next.val)
                h.next = h.next.next;
            
            h = h.next;
        }
        
        return head;
    }
}