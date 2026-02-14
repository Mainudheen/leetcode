class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum = nums[0];
        int max = 0;
        if(nums.length<2){
            return nums[0];
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] < nums[i]){
                sum+=nums[i];
            }else{
                max = Math.max(max,sum);
                sum = 0;
                sum+=nums[i];
            }
            if(i==nums.length-1){
                max = Math.max(max,sum);
            }
        }
        return max;
    }
}