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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer>arr=new ArrayList<>();
        print(arr,root);
        return arr;
        
    }
    public void print( ArrayList<Integer>arr,TreeNode root){
        if(root==null) return;
        print(arr,root.left);
        print(arr,root.right);
        arr.add(root.val);

    }
}