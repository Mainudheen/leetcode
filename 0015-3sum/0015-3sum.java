class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int val = 0;val<nums.length-2;val++){
            if(val > 0 && nums[val] == nums[val-1]) continue;
            int left = val+1;
            int right = nums.length-1;
            while(left < right){
                int sum = nums[val]+nums[left]+nums[right];
                if(sum == 0){
                    list.add(Arrays.asList(nums[val],nums[left],nums[right]));
                    while(left < right && nums[left]==nums[left+1])left++;
                    while(left < right && nums[right] == nums[right-1]) right--; 
                    left++;
                    right--; 
                }
                else if(sum < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return list;
    }
}