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
        public boolean isValidBST(TreeNode root) {
        TreeNode curr=root;
        long preValue = Long.MIN_VALUE;

        while(curr != null){
            if(curr.left==null){
                if(preValue >= curr.val){
                    return false;
                }
                preValue=curr.val;
                curr=curr.right;
            }else{
                TreeNode ip=curr.left;
                while(ip.right!=null && ip.right !=curr){
                    ip=ip.right;
                }

                if(ip.right == null){
                    ip.right=curr;
                    curr=curr.left;
                }else{
                    ip.right=null;
                    if(preValue >= curr.val){
                        return false;
                    }
                    preValue=curr.val;
                    curr=curr.right;
                }
            }
        }
        return true;
    }
}