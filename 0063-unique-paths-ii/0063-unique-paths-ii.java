class Solution {
    public int uniquePathsWithObstacles(int[][] obs) {
        int m = obs.length;
        int n = obs[0].length;
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            if(obs[i][0] == 1){
                break;
            }
            dp[i][0] = 1;
        }  
        for(int i=0;i<n;i++){
            if(obs[0][i] == 1){
                break;
            }
            dp[0][i] = 1;
        } 
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(obs[i][j] != 1){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}