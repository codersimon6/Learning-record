//给定一个单链表 L：L0→L1→…→Ln-1→Ln ， 
//将其重新排列后变为： L0→Ln→L1→Ln-1→L2→Ln-2→… 
//
// 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。 
//
// 示例 1: 
//
// 给定链表 1->2->3->4, 重新排列为 1->4->2->3. 
//
// 示例 2: 
//
// 给定链表 1->2->3->4->5, 重新排列为 1->5->2->4->3. 
// Related Topics 链表 
// 👍 350 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null)return;
        List<ListNode> list = new ArrayList<>();
        ListNode cur = head;
        LinkedList<> L = new LinkedList();
        L.clear();
        while (cur != null){
            list.add(cur);
            cur = cur.next;
        }
        int i = 0,j = list.size()-1;
        while (i < j){
            list.get(i).next = list.get(j);
            i++;
            if(i == j)break;
            list.get(j).next = list.get(i);
            j--;
        }
        list.get(i).next = null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
