class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int minlen = Integer.MAX_VALUE;
        int cursum = 0;
        for(int right =0;right<nums.length;right++){
            cursum += nums[right];

            while(cursum >= target){
                if(right-left+1 < minlen){
                    minlen = right-left+1;
                }
                cursum -= nums[left];
                left++;
            }


        }
        return minlen != Integer.MAX_VALUE ? minlen : 0;
    }
}