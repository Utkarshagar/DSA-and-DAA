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
       


        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
         if (size == n) {
    return head.next;}
        int m=size-n;
        temp=head;
        for(int i=1;i<m;i++){
            temp=temp.next;

        }
       
        if (temp.next != null) {
    temp.next = temp.next.next;
}
        return head;
        
    }
}