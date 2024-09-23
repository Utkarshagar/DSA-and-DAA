package java_project.TREE;
import java.util.*;
class Node{
    int  data;
    Node left;
    Node right;
    Node(int d){
        this.data=d;
        this.left=null;
        this.right=null;

    }
}
public class create_tree {
    
    public static Node createtree(Node root){
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        root=new Node(data);
        if (data==-1){
            return null;

        }
        root.left=createtree(root.left);
        root.right=createtree(root.right);
        return root;
    }
    public static void main(String[] args) {
        Node root=null;
        root=createtree(root);
    }
    
    
}
