class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left = -1;
        int right = 0;
        int max = 0;
        while(right < nums.length){
            if(nums[right] == 1){
                max = Math.max(max,right-left);
            }else{
                left = right;
            }
            right++;
        }
        return max;
    }
}