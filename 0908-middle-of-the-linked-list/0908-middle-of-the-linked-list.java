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
    public ListNode middleNode(ListNode head) {
        //using slow and fast pointer approach
        ListNode slow=head;
        ListNode fast=head;
        // in case of even size fast is null and odd fast.next is null
        while(fast!=null && fast.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
        
    }
}