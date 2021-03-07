/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)return true;
        return dfs(root.left,root.right);
    }

    public boolean dfs(TreeNode l,TreeNode r){
        if(r == null && l == null)return true;
        if(r == null || l == null)return false;
        if(l.val != r.val )return false;

        return dfs(l.left,r.right) && dfs(l.right,r.left);
    }
}