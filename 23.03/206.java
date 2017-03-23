/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        ListNode buf;
        
        while (cur!=null) {
            buf = cur.next;
            cur.next = prev;
            prev = cur;
            cur = buf;
        }
        return prev;
    }
}