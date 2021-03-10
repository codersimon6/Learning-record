import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 *   public ListNode(int val) {
 *     this.val = val;
 *   }
 * }
 */

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param pHead ListNode类 
     * @param k int整型 
     * @return ListNode类
     */
    public ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here
        if(pHead == null || pHead.next == null) return pHead;
        ListNode p1 = pHead;
        ListNode p2 = pHead;
        int count = 0;
        while(count < k && p1 !=null){
            p1 = p1.next;
            count++;
        }
        if(count < k)return null;
        while(p1 != null){
            p2 = p2.next;
            p1 = p1.next;
        }
        return p2;
    }
}