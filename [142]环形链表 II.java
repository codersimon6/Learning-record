//给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。 
//
// 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。 
//
// 说明：不允许修改给定的链表。 
//
// 
//
// 示例 1： 
//
// 输入：head = [3,2,0,-4], pos = 1
//输出：tail connects to node index 1
//解释：链表中有一个环，其尾部连接到第二个节点。
// 
//
// 
//
// 示例 2： 
//
// 输入：head = [1,2], pos = 0
//输出：tail connects to node index 0
//解释：链表中有一个环，其尾部连接到第一个节点。
// 
//
// 
//
// 示例 3： 
//
// 输入：head = [1], pos = -1
//输出：no cycle
//解释：链表中没有环。
// 
//
// 
//
// 
//
// 进阶： 
//你是否可以不用额外空间解决此题？ 
// Related Topics 链表 双指针 
// 👍 658 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.HashSet;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        //快慢指针同时从头出发
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null){
            slow = slow.next;
            if (fast.next != null) {
                //快指针先入环
                fast = fast.next.next;
            } else {
                return null;
            }
            //假设无环的距离为x，入环后相遇走得距离为L，环长为c，因为快指针走过的距离为满指针的二倍，所以可得 ：2(x + L) = x + Nc + L。即： x = Nc - L .无环的距离为x，而 c- L刚好为从相遇点到入环点的距离。若此时fast从头出发，走x长，slow同步运动，则刚好到入环口停止
            if(fast == slow){
                fast = head;
                while(fast != slow){
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
