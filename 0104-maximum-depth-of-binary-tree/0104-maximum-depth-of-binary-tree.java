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
    public int maxDepth(TreeNode root) {
        return traversal(root);
    }
    private int traversal(TreeNode curr){
        if(curr==null)return 0;
        int left=traversal(curr.left);
        int right=traversal(curr.right);
        return 1+Math.max(left,right);
    }
}