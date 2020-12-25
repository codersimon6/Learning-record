//给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。 
//
// 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。 
//
// 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 示例： 
//
// 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807
// 
// Related Topics 链表 数学 
// 👍 4930 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers (ListNode f1, ListNode f2) {
        ListNode newhead = new ListNode(0);
        ListNode cur = newhead;
        int res = 0;
        
        while(f1 != null || f2 != null){
            int a = f1==null?0:f1.val;
            int b = f2==null?0:f2.val;
            int sum = a + b + res;
            
            if(sum > 9){
                res = 1;
                sum = sum-10;
            }
            cur.next = new ListNode(sum);
            cur = cur.next;
            if(f1 != null)f1 = f1.next;
            if(f2 != null)f2 = f2.next;
        }
        
        if(res == 1)cur.next = new ListNode(res);
        return newhead.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
