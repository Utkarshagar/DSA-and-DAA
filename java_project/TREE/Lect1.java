package java_project.TREE;

import java.util.Scanner;
import java.util.Stack;

public class Lect1 {
    Scanner sc=new Scanner(System.in);
    class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
        }
    }

    
    static Node root=null;
    private  void CreateTree(){
        
        this.root=CreateTree(root);
    }
    public Node CreateTree(Node root){

        if(root==null){
            System.out.println("Enter the root node");
        }
        int data =sc.nextInt();
        Node nn=new Node(data);
        boolean hlc=sc.nextBoolean();
        if (hlc) {
            nn.left=CreateTree(nn);
            
        }
        boolean hrc=sc.nextBoolean();
        if(hrc){
            nn.right=CreateTree(nn);
        }
        return nn;

    }
    
    //pre order
    // public static void preorder(Node root){
    //     if(root==null){
    //         return;
    //     }
    //     System.out.println(root.data);
    //     preorder(root.left);
    //     preorder(root.right);
    // }
    public static void pre(Node root){
        if (root == null) {
            return;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            System.out.println(current.data);

            if (current.right != null) {
                stack.push(current.right);
            }

            if (current.left != null) {
                stack.push(current.left);
            }
        }
    } 
    public static void post(Node root){
        if(root==null) return;
        Stack<Node> st=new Stack<>();
        Stack<Integer> p=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            Node curr=st.pop();
            p.push(curr.data);
            if(curr.left!=null) st.push(curr.left);
            if(curr.right!=null) st.push(curr.right);
        }
        while(!p.isEmpty()){
            System.out.print(p.pop()+" ");
        }
    }
    public static int height(Node root){
        if(root==null) return 0;
        int left=height(root.left);
        int right=height(root.right);
        return Math.max(left,right)+1;
    }

    public static void main(String[] args) {
        Lect1 tt=new Lect1();
        root=tt.CreateTree(root);
        //post(root);
        System.out.println(height(root));

    }

    
}


    

