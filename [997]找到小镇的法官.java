//在一个小镇里，按从 1 到 N 标记了 N 个人。传言称，这些人中有一个是小镇上的秘密法官。 
//
// 如果小镇的法官真的存在，那么： 
//
// 
// 小镇的法官不相信任何人。 
// 每个人（除了小镇法官外）都信任小镇的法官。 
// 只有一个人同时满足属性 1 和属性 2 。 
// 
//
// 给定数组 trust，该数组由信任对 trust[i] = [a, b] 组成，表示标记为 a 的人信任标记为 b 的人。 
//
// 如果小镇存在秘密法官并且可以确定他的身份，请返回该法官的标记。否则，返回 -1。 
//
// 
//
// 示例 1： 
//
// 输入：N = 2, trust = [[1,2]]
//输出：2
// 
//
// 示例 2： 
//
// 输入：N = 3, trust = [[1,3],[2,3]]
//输出：3
// 
//
// 示例 3： 
//
// 输入：N = 3, trust = [[1,3],[2,3],[3,1]]
//输出：-1
// 
//
// 示例 4： 
//
// 输入：N = 3, trust = [[1,2],[2,3]]
//输出：-1
// 
//
// 示例 5： 
//
// 输入：N = 4, trust = [[1,3],[1,4],[2,3],[2,4],[4,3]]
//输出：3 
//
// 
//
// 提示： 
//
// 
// 1 <= N <= 1000 
// trust.length <= 10000 
// trust[i] 是完全不同的 
// trust[i][0] != trust[i][1] 
// 1 <= trust[i][0], trust[i][1] <= N 
// 
// Related Topics 图 
// 👍 90 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    //因为小镇的法官不相信任何人，每个人（除了小镇法官外）都信任小镇的法官。
    //所有，谁得到了N-1人的支持，谁就是法官
    public int findJudge(int N, int[][] trust) {
        //N个人，编号从1开始，所以数组大小N+1
        int[] score = new int[N+1];
        for (int[] tem:trust) {
            //遍历信任对数组，如果他给别人投票，也就是出现在0位置，票数-1
            score[tem[0]]--;
            //如果别人给他投票，也就是出现在1位置。票数+1
            score[tem[1]]++;
        }
        //默认法官不存在。找到票数为N-1的人，则他就是法官。没有的话法官就不存在
        int judge = -1;
        for(int i = 1;i < N + 1;i++){
            if (score[i] == N-1){
                judge = i;
                break;
            }
        }
        return judge;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
