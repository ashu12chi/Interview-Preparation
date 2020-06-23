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
        ListNode New = new ListNode(0), pre = New, cur = head;
        New.next = head;
        while(cur != null) {
            while(cur.next != null && cur.val == cur.next.val)
                cur = cur.next;
            if(pre.next == cur)
                pre = pre.next;
            else
                pre.next = cur.next;
            cur = cur.next;
        }
        return New.next;
    }
}
