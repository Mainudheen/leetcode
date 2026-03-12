class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int max = 0;
        int res = 0;
        int count = 0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==1){
                count++;
            }
            
            if((right-left+1)-count>k){
                if(nums[left]==1){
                    count--;
                   
                }
                 left++;
            }
            res = Math.max(res,right-left+1);
        }
        return res;
    }
}