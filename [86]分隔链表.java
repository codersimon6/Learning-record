/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode prev1 = new ListNode();
        ListNode prev = prev1;
        ListNode cur1 = new ListNode();
        ListNode cur = cur1;
        while (head != null){ 
            if(head.val < x){
                prev.next = head;
                prev = head;
            }
            else{
                cur.next = head;
                cur = head;
            }
            head = head.next;
        }
        cur.next = null;
        prev.next = cur1.next;
        return prev1.next;
    }
}