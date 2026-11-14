class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            int ans = nums[i]+nums[i+1];
            if(ans%2==0){
                return false;
            }
        }
        return true;
    }
}