class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int bot = numBottles;
        int ans = numBottles;
        
        while(bot >= numExchange){
            int rem = bot % numExchange;
            int empty = bot / numExchange;
            ans += empty;
            bot = empty + rem;
        } 
        return ans; 
    }
}