class Solution {
    public boolean canPartition(int[] nums) {
        int total = 0;
        for(int n:nums){
            total+=n;
        }
        if(total % 2 != 0){
            return false;
        }

        int tar = total/2;
        boolean[] dp = new boolean[tar+1];
        dp[0] = true;

        for(int num:nums){
            for(int j=tar;j>=num;j--){
                if(dp[j-num]){
                    dp[j] = true;
                }
            }
        }
        return dp[tar];
    }
}