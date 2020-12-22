//给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。 
//
// 如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。 
//
// 注意：你不能在买入股票前卖出股票。 
//
// 
//
// 示例 1: 
//
// 输入: [7,1,5,3,6,4]
//输出: 5
//解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
//     注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
// 
//
// 示例 2: 
//
// 输入: [7,6,4,3,1]
//输出: 0
//解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
// 
// Related Topics 数组 动态规划 
// 👍 1355 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    //我们只需要遍历价格数组一遍，记录历史最低点，然后在每一天考虑这么一个问题：
    // 如果我是在历史最低点买进的，那么我今天卖出能赚多少钱？
    // 当考虑完所有天数之时，我们就得到了最好的答案。
    public static int maxProfit(int[] prices) {
        int minBuy = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < minBuy)minBuy = prices[i];
            if(prices[i] -minBuy > maxProfit)maxProfit = prices[i] - minBuy;
        }
        return maxProfit;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
