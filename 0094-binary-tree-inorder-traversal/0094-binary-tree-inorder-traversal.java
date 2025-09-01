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
        ArrayList<Integer> arr=new ArrayList<>();
        print(root,arr);
        return arr;
        
    }
    public static void print(TreeNode root,ArrayList<Integer>arr){
        if(root==null) return;
        print(root.left,arr);
        arr.add(root.val);
        print(root.right,arr);
    }
}