/*LeetCode.82. 删除排序链表中的重复元素 II
给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。

示例 1:
输入: 1->2->3->3->4->4->5
输出: 1->2->5

示例 2:
输入: 1->1->1->2->3
输出: 2->3
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) {
            return head;
        }
        ListNode cur1 = new ListNode();
        cur1.next = head;
        ListNode cur = cur1;
        while(cur.next != null && cur.next.next != null){
            if(cur.next.val == cur.next.next.val){
                ListNode tem = cur.next;
                while(tem != null && tem.next != null && tem.val == tem.next.val ){
                    tem = tem.next;
                }
                cur.next = tem.next; 
            }else{cur = cur.next;}
        }
        return cur1.next;
    }
}
