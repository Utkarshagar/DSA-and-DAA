package java_project.linked_list;
import java.util.*;

public class code1 {
    Node head;
    private int size;
    code1(){
        this.size=0;
    }

    class Node{
        String data;
        Node next;
        Node(String data){// making constructor
            this.data=data;
            this.next=null;
            size++;

        }

    }
    //add first
    public void addfirst(String data){
        // Scanner sc=new Scanner(System.in);
        // data=sc.nextLine(); 
        Node newNode= new Node(data);

        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;


    }
    public void addlast(String data ){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;

        }
        Node curnode=head;
        while(curnode.next !=null){
            curnode=curnode.next;

        }
        curnode.next=newNode;

    }
    public void print(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node curnode=head;
        while(curnode!=null){
            System.out.print(curnode.data+"-->");
            curnode=curnode.next;
        }
        System.out.println("null");
    }
    public void deletefirst(){
        if(head==null){
            System.out.println("this list is empty");
            return;
        }
        size--;
        head=head.next;
    }
    public void deletelast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondlast=head;
        Node lastnode=head.next;
        if(lastnode!=null){
            lastnode=lastnode.next;

            secondlast=secondlast.next;
        }
        secondlast.next=null;

    }
    public int getsize(){
        return size;
    }
    // reverse linked list
    public void reverseiterate(){
        if(head==null || head.next==null){
            return;
        }
        Node prev=head;
        Node curr=head.next;
        if(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head.next=null;
        head=prev;

    }


    public static void main(String[] args) {
        code1 list =new code1();
        Scanner sc=new Scanner(System.in);
        
        // list.addfirst("a");
        // list.addfirst("is");
        // list.addfirst("this");
        for(int i=0;i<3;i++){
            String str=sc.nextLine();
            list.addfirst(str);

        }
        

        //list.print();
        list.addlast("hello");
        //list.deletefirst();
        //list.deletelast();
        list.print();
        //System.out.println(list.getsize());
        list.reverseiterate();
        list.print();
        
    }
    
}
