package java_project.class_codes_and_extracode.trees;

import java.util.Scanner;

public class binary_tree {
    class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    private Node root=null;
    private static Scanner sc=new Scanner(System.in);
    public binary_tree(){
        this.root=createTree();
    }
    private Node createTree(){
        int data =sc.nextInt();
        Node node=new Node(data);
        int  doesLeftChildPresent=sc.nextInt();
        if(doesLeftChildPresent==1){
            node.left=createTree();
        }

        
    }
    
}
