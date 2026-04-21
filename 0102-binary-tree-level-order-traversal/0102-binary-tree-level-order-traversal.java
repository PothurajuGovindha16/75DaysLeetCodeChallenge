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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)return res;

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode value=q.poll();
                temp.add(value.val);
                if(value.left != null)q.add(value.left);
                if(value.right != null)q.add(value.right);
            }
            res.add(temp);
        }
        return res;
    }
}