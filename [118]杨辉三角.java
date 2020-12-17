//给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。 
//
// 
//
// 在杨辉三角中，每个数是它左上方和右上方的数的和。 
//
// 示例: 
//
// 输入: 5
//输出:
//[
//     [1],
//    [1,1],
//   [1,2,1],
//  [1,3,3,1],
// [1,4,6,4,1]
//] 
// Related Topics 数组 
// 👍 370 👎 0


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        //最终结果 lists
        List<List<Integer>> lists = new ArrayList<>();
        if(numRows == 0)return lists;
        for(int i = 0;i < numRows;i++){
            //每行结果 list
            List<Integer> list = new ArrayList<>();
            for(int j = 0;j <= i;j++){
                //每行首尾元素为1
                if(j == 0 || j == i){
                    list.add(1);
                }else {
                    //当前位置元素 = 上一行当前位置元素 + 上一行前一位置元素
                    list.add(lists.get(i - 1).get(j) + lists.get(i - 1).get(j - 1));
                }
            }
            //每行的结果加到lists里
            lists.add(list);
        }
        return lists;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
