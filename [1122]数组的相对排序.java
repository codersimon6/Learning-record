//给你两个数组，arr1 和 arr2， 
//
// 
// arr2 中的元素各不相同 
// arr2 中的每个元素都出现在 arr1 中 
// 
//
// 对 arr1 中的元素进行排序，使 arr1 中项的相对顺序和 arr2 中的相对顺序相同。未在 arr2 中出现过的元素需要按照升序放在 arr1 的末
//尾。 
//
// 
//
// 示例： 
//
// 输入：arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
//输出：[2,2,2,1,4,3,3,9,6,7,19]
// 
//
// 
//
// 提示： 
//
// 
// arr1.length, arr2.length <= 1000 
// 0 <= arr1[i], arr2[i] <= 1000 
// arr2 中的元素 arr2[i] 各不相同 
// arr2 中的每个元素 arr2[i] 都出现在 arr1 中 
// 
// Related Topics 排序 数组 
// 👍 92 👎 0

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int l1 = arr1.length,l2 = arr2.length;
        int[] result = new int[l1];
        if(arr1.length == 0)return result;
        if(arr2.length == 0)return arr1;
        List<Integer> list = new ArrayList<>();
        for(int m: arr1){
            list.add(m);
        }
        int p1 = 0;
        for(int i = 0;i < l2;i++){
            while (list.contains(arr2[i])){
                result[p1++] = arr2[i];
                int index = list.indexOf(arr2[i]);
                list.remove(index);
            }
        }
        Collections.sort(list);
        while (!list.isEmpty()){
            result[p1++] = list.remove(0);
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
