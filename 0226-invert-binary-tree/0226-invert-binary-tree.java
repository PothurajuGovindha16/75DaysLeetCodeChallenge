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
    public TreeNode invertTree(TreeNode root) {
        return traversal(root);
    }
    private TreeNode traversal(TreeNode root){
        if(root==null)return null;
        TreeNode left=traversal(root.left);
        TreeNode right=traversal(root.right);
        root.left=right;
        root.right=left;
        return root;
    }
}