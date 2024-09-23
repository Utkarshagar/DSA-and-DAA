package java_project.lecture2;

import java.util.*;
public class aa {
    static  class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    public void creation(){
        int data,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while (n-->0) {
            
        
         data=sc.nextInt();
         Node newnode=new Node(data);
         if(head==null){
            head=newnode;
         }
         else{
            newnode.next=head;
            head=newnode;
         }
         

    }

}
public void display(){
    Node temp=head;
    if(temp==null){
        return;
    }
    while(temp!=null){
        System.out.print(temp.data);
        temp=temp.next;
    }
}

    public static void main (String args[]) {
        aa ll=new aa();
        ll.creation();
        ll.display();

    }
}