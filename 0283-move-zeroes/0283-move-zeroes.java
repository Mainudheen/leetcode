class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;
        while(left < nums.length){
            if(nums[left] == 0){
                if((right+1) < nums.length){
                    right = left+1;
                }else{
                    return;
                }
                while(right < nums.length){
                    if(nums[right]!=0){
                        nums[left] = nums[right];
                        nums[right] = 0;
                        break;
                    }else{
                        right++;
                    }
                }
            }
            left++;
        }
    }
}