//给定一个以字符串表示的非负整数 num，移除这个数中的 k 位数字，使得剩下的数字最小。 
//
// 注意: 
//
// 
// num 的长度小于 10002 且 ≥ k。 
// num 不会包含任何前导零。 
// 
//
// 示例 1 : 
//
// 
//输入: num = "1432219", k = 3
//输出: "1219"
//解释: 移除掉三个数字 4, 3, 和 2 形成一个新的最小的数字 1219。
// 
//
// 示例 2 : 
//
// 
//输入: num = "10200", k = 1
//输出: "200"
//解释: 移掉首位的 1 剩下的数字为 200. 注意输出不能有任何前导零。
// 
//
// 示例 3 : 
//
// 
//输入: num = "10", k = 2
//输出: "0"
//解释: 从原数字移除所有的数字，剩余为空就是0。
// 
// Related Topics 栈 贪心算法 
// 👍 348 👎 0


import java.util.*;

//leetcode submit region begin(Prohibit modification and deletion)

/**
 * 思路：当前位小于前一位时，对前一位出栈，当前位入栈。
 * 另外注意，如12345，我们需要删除3位，得到12，刚才我们说思路就不符合要求了
 * 所以我们需要加上：如果删除的数字个数不够K位，就从尾部删除够为止。
 *
 *
 */

class Solution {
    public String removeKdigits(String num, int k) {
        int l = num.length();
        if(k == l)return "0";
        char[] ch = num.toCharArray(); //转为字符数组
        Stack<Character> stack = new Stack<>();
        for(char s:ch){
            while (!stack.isEmpty() && k > 0 && stack.peek() > s){
                stack.pop();
                k--;
            }
            if(stack.isEmpty() && s == '0')continue;
            stack.push(s);
        }
        while (k > 0){
            stack.pop();
            k--;
        }
        if(stack.size() == 0)return "0";
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
