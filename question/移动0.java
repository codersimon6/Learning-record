/**

给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
*/


class Solution {
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0)return;
        int index = 0;
        //遍历，把非0的都放在前面。剩下的都是0
        for(int i = 0;i < nums.length;i++){
            if(nums[i] != 0){
                nums[index++] = nums[i];
            }
        }
        for(;index < nums.length;index++){
            nums[index] = 0;
        }
    }
}
