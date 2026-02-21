class Solution {
    public int maxProfit(int[] prices) {
        int max = prices[0];
        int sum = 0;
        for(int i=0;i<prices.length;i++){
            if(max > prices[i]){
                max = prices[i];
            }
            sum = Math.max(sum,prices[i]-max);
        }
        return sum;
    }
}