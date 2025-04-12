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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         if (list1 == null) return list2;
        if (list2 == null) return list1;

       ArrayList<ListNode>arr=new ArrayList<>();
       ListNode temp1=list1;

       while(temp1!=null){
        arr.add(temp1);
        temp1=temp1.next;
       }
        ListNode temp2=list2;

       while(temp2!=null){
        arr.add(temp2);
        temp2=temp2.next;
       }
       Collections.sort(arr, (a, b) -> a.val - b.val);
      for(int i=0;i<arr.size()-1;i++){
        arr.get(i).next=arr.get(i+1);

      }
      arr.get(arr.size()-1).next=null;
      return arr.get(0);

        
    }
}