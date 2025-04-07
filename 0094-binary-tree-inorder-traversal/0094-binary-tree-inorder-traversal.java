/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer>arr=new ArrayList<>();
        print (arr,root);
        return arr;

        
    }
    public static void print(ArrayList<Integer>arr,TreeNode root){
        if(root==null) return;
        print(arr,root.left);
        arr.add(root.val);
        print(arr,root.right);
    }
}