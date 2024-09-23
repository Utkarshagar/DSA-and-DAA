package java_project.lecture2;
import java.util.*;

public class create_displaylinkedlist {
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
        int length=6;
        while (length-->0) {
            
        
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
 void display(){
    Node temp= head;
    if(head==null){
        return;
        
    }
    else{
        while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
    }
}

 }

//creation ends
    public static void main(String[] args) {
        hello ll=new hello();
        ll.creation();
        ll.display();

        
    }
    
}
