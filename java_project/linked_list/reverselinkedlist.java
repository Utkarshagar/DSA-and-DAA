package java_project.linked_list;

public class reverselinkedlist {
    class Node{
        int data;
        Node next=null;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    public void add(int n){
        
        Node newnode=new Node(n);
        if(head==null){
            head=newnode;
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
            

        }
        curr.next=newnode;




    }
    public static void main(String[] args) {
        
    }
    
}
