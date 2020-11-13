/*
LeetCode.19. 删除链表的倒数第N个节点
给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。

> 示例： 给定一个链表: 1->2->3->4->5, 和 n = 2.
>  当删除了倒数第二个节点后
>  链表变为 1->2->3->5.

说明：给定的 n 保证是有效的。

进阶：你能尝试使用一趟扫描实现吗？
Tips: 链表  快慢指针
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tem = new ListNode(0);
        tem.next = head;
        ListNode pre = tem,cur = tem;

        while(n != 0){
            cur = cur.next;
            n --;
        }
        
        while (cur.next != null){
            cur = cur.next;
            pre = pre.next;
        }
        pre.next = pre.next.next;
        return tem.next;
    }
}