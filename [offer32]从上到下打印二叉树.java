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
    public int[] levelOrder(TreeNode root) {
        if (root == null) return new int[0];
        LinkedList<TreeNode> list = new LinkedList<>();
        ArrayList<Integer> array = new ArrayList<>();
        list.offer(root);
        while (list.size() != 0) {
            TreeNode tem = list.poll();
            array.add(tem.val);
            if (tem.left != null) {
                list.offer(tem.left);
            }
            if (tem.right != null) {
                list.offer(tem.right);
            }
        }
        int[] a = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            a[i] = array.get(i);
        }
        return a;
    }
}