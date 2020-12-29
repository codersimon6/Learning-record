//给你一个整数数组 A，只有可以将其划分为三个和相等的非空部分时才返回 true，否则返回 false。 
//
// 形式上，如果可以找出索引 i+1 < j 且满足 A[0] + A[1] + ... + A[i] == A[i+1] + A[i+2] + ... + 
//A[j-1] == A[j] + A[j-1] + ... + A[A.length - 1] 就可以将数组三等分。 
//
// 
//
// 示例 1： 
//
// 输入：[0,2,1,-6,6,-7,9,1,2,0,1]
//输出：true
//解释：0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1
// 
//
// 示例 2： 
//
// 输入：[0,2,1,-6,6,7,9,-1,2,0,1]
//输出：false
// 
//
// 示例 3： 
//
// 输入：[3,3,6,5,-2,2,5,1,-9,4]
//输出：true
//解释：3 + 3 = 6 = 5 - 2 + 2 + 5 + 1 - 9 + 4
// 
//
// 
//
// 提示： 
//
// 
// 3 <= A.length <= 50000 
// -10^4 <= A[i] <= 10^4 
// 
// Related Topics 数组 
// 👍 123 👎 0


//leetcode submit region begin(Prohibit modification and deletion)



class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int a: A) {
            sum+=a;
        }
        //和不为3的倍数，直接返回false
        if(sum%3 != 0)return false;
        int left = 0,right = A.length -1;//左右指针同时遍历
        int leftsum = A[left]; //左分组和
        int rightsum = A[right];//右分组和
        while (right - left  > 1){ //左右指针间最最少存在一个元素
            //如果左右分组满足条件，中间分组肯定满足
            if(leftsum == sum/3 &&  rightsum== sum/3){
                return true;
            }
            //leftsum赋予了初值A[0]且判断过，所以先left++，再leftSum += A[left];
            if(leftsum != sum/3){
                leftsum += A[++left];
            }
            //同left
            if(rightsum != sum/3){
                rightsum += A[--right];
            }
        }
        return false;
    }
}


//leetcode submit region end(Prohibit modification and deletion)
