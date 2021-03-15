class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> map = new HashMap<>();//key保存nums[i]，value保存下标
        for(int i = 0;i <= nums.length;i++){
            if(map.containsKey(target-nums[i])){ 
            //如果target-nums[i]在哈希表中，返回对应数的value，即下标。
                return new int [] {map.get(target-nums[i]),i};
                }
            // 否则将nums[i]存为key,下标存为value
            else map.put(nums[i],i);
        }
        return null;
    }
}