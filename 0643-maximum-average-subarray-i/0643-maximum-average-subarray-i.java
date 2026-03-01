class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        double sum = 0;
        double res = Integer.MIN_VALUE;
        for(int right = 0;right<nums.length;right++){
            sum += nums[right];
            if((right-left+1)==k){
                double avg = sum/k;
                res = Math.max(res,avg);
                sum -= nums[left];
                left++;
            }
        }
        return res;
    }
}