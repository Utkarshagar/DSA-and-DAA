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
    public ListNode reverseList(ListNode head) {
        if(head==null) return head;
        ArrayList<Integer>arr=new ArrayList<>();
        ListNode temp1=head;
        while(temp1!=null){
            arr.add(temp1.val);
            temp1=temp1.next;

        }
        ListNode temp2=new ListNode(arr.get(arr.size()-1));
        ListNode temp3=temp2;
        for(int i=arr.size()-2;i>=0;i--){
            temp3.next=new ListNode(arr.get(i));
            temp3=temp3.next;

        }
        return temp2;
    }
}