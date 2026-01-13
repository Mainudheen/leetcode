class Solution {
    public int[][] merge(int[][] it) {
        int m = it.length;
        int n = it[0].length;
        Arrays.sort(it,(a,b)->{
            if(a[0]!=b[0]){
                return Integer.compare(a[0],b[0]);
            }
            return Integer.compare(a[1],b[1]);
        });
        int[][] temp = new int[m][n];
        int a = 0;
        int b = 0;
        temp[a][0] = it[0][0];
        temp[a][1] = it[0][1];
        int i=1;
        int k=0;
        while(i<m){
            if(temp[k][1] >= it[i][0]){
                temp[k][1] = Math.max(temp[k][1],it[i][1]);
            }else{
                k++;
                temp[k][0] = it[i][0];
                temp[k][1] = it[i][1];
            }
            i++;
        } 
       
        int[][] ans = new int[k + 1][2];
        for (i = 0; i <= k; i++) {
            ans[i][0] = temp[i][0];
            ans[i][1] = temp[i][1];
        }
        
       
        return ans;
    }
}