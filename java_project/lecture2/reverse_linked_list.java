package java_project.lecture2;
class LinkedList{
    static Node head;
    static class Node{
        int data ;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }

    }
}
Node reverse(Node node){
    Node prv=null;
    Node current=node;
    Node next=null;
    while(current!=null){
        next=current.next;
        current.next=prv;
        prv=current;
        current=next;
    }
    node=prv;
    return node;
}
void printList(Node node){
    while
}

public class reverse_linked_list {
    

    
}
