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
    List<List<Integer>> list = new LinkedList<>();

    public void help(TreeNode root,int lev){
        if(lev == list.size()){
            list.add(new LinkedList<>());
            }
        list.get(lev).add(root.val);
        if(root.left != null)help(root.left,lev+1);
        if(root.right != null)help(root.right,lev+1);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null)return list;
        help(root,0);
        for(int i = 1;i < list.size();i+=2){
            Collections.reverse(list.get(i));
        }
        return list;
    }
}