//给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。 
//
// 
//
// 示例： 
//二叉树：[3,9,20,null,null,15,7], 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7
// 
//
// 返回其层次遍历结果： 
//
// [
//  [3],
//  [9,20],
//  [15,7]
//]
// 
// Related Topics 树 广度优先搜索 
// 👍 659 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.LinkedList;

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
        if(lev == list.size())list.add(new LinkedList<>());
        list.get(lev).add(root.val);
        if(root.left != null)help(root.left,lev+1);
        if(root.right != null)help(root.right,lev+1);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null)return list;
        help(root,0);
        return list;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
