package java_project.linked_list;

// public class input_linkedlist {
    
// }
import java.util.*;
public class input_linkedlist{
    
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }

    }// node class completed
    //making Add last
    Node head=null;

    
    public  void addlast(int n){
        
        Node newnode=new Node(n);
        if(head==null){
            head=newnode;
            return;

        }
        Node currNode=head;
        while (currNode.next!=null) {
            currNode=currNode.next;
            
        }
        currNode.next=newnode;

    }
    public void display(int n){
        // Node newnode=new Node(n);
        // if(head==null){
        //     head=newnode;
        //     return;

        // }
        Node currNode=head;
        while(currNode!=null){
            
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }
    }
   
    public static void main (String args[]) {
        input_linkedlist ll=new input_linkedlist();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            ll.addlast(sc.nextInt());
        }
        ll.display(n);

        
        

        

    }
}
