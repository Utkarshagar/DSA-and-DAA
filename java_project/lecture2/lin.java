package java_project.lecture2;
import java.util.*;

public class lin {
    int size=0;
    Node head=null;
    Node tail=null;
    public class Node {
        int val;
        Node next;
        Node(){}
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    public void addFirst(int val){
        Node nn = new Node();
        nn.val=val;
        if(size==0){
            head=nn;
            tail=nn;
        }
        else{
        nn.next=head;
        head=nn;
        }
        size++;
    }
    public void add(int val){
        Node nn = new Node();
        nn.val=val;
        if(size==0){
            head=nn;
            tail=nn;
        }
        else{
        tail.next=nn;
        tail=nn;
        }
        size++;
    }
    public void insert(int pos,int val){
        Node nn = new Node();
        nn.val=val;
        if(pos<=0) addFirst(val);
        else if(pos>=size) add(val);
        else{
        Node prev=getNode(pos-1);
        Node nex=getNode(pos);
        prev.next=nn;
        nn.next=nex;
        size++;
        }
    }
    public int getFirst(){
        return head.val;
    }
    public int getLast(){
        return tail.val;
    }
    public int getKth(int k){
        return getNode(k).val;
    }
    public void removeFirst(){
        if(size==0) System.out.println("LinkedList Is Empty");
        else if(size==1){
            head=null;
            tail=null;
        }
        else{
            Node temp=head;
            head=head.next;
            temp.next=null;
        }
        size--;
    }
    public void removeLast(){
        if(size==0) System.out.println("LinkedList Is Empty");
        else if(size==1){
            head=null;
            tail=null;
        }
        else{
            tail=getNode(size-2);
            tail.next=null;
        }
        size--;
    }
    public void removeKth(int k){
        if(size==0) System.out.println("LinkedList Is Empty");
        else if(size==1){
            head=null;
            tail=null;
        }
        else if(k==0) removeFirst();
        else if(k==size-1) removeLast();
        else{
            if(k==0) removeFirst();
            else if(k==size-1) removeLast();
            Node t=getNode(k-1);
            Node n=getNode(k+1);
            t.next=n;
            size--;
        }
        
    }
    public Node getNode(int k){
        Node temp=head;
        for(int i=0;i<k;i++){
            temp=temp.next;
        }
        return temp;
    }
    public void Display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
        System.out.println();
    }
    /* private void createcycle(){
        tail.next=head.next;
    }
    private char[] is cycle(){
        Node slow =head;
        Node fast=head;
        while(fast!=null){
            if(slow== fast){
                return true;
            }
        }
        return false;
    }*/  
    public static void main(String[] args) {
        lin ll=new lin();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.Display(ll.head);
        ll.add(50);
        ll.Display(ll.head);
        ll.insert(2, 100);
        ll.insert(100,500);
        ll.insert(0, -1);
        ll.insert(-100, -2);
        ll.Display(ll.head);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.err.println(ll.getKth(2));
        ll.removeFirst();
        ll.removeLast();
        ll.removeKth(0);
        ll.Display(ll.head);
    }
}