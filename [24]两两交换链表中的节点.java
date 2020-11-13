//给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。 
//
// 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。 
//
// 
//
// 示例: 
//
// 给定 1->2->3->4, 你应该返回 2->1->4->3.
// 
// Related Topics 链表 
// 👍 657 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)return head;
        ListNode p1 = head,p2 = head.next;
        ListNode newhead = p2;
        while (true){
            p1.next = p2.next;
            p2.next = p1;
            if(p1.next == null || p1.next.next == null)break;
            ListNode tem = p1.next; //  记录一下，否则执行“串起来”后无法让p1,p2指向两个新的待交换节点
            p1.next = p1.next.next; // p1和p2串起来，让p1.next指向新p2的位置
            p1 = tem;  //p1指向新p1位置
            p2 = tem.next; //p2指向新p2位置
        }
        return newhead;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
