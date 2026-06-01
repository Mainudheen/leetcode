class Solution {
    public int minimumCost(int[] cost) {
        int n = cost.length;
        int count = 0;
        int sum = 0;
        Arrays.sort(cost);
        for(int i=n-1;i>=0;i--){
            if(count == 2){
                if(cost[i] <= cost[i+1]){
                    count = 0;
                    continue;
                }
            }
            sum+=cost[i];
            System.out.println(sum);
            count++;

        }
        return sum;
    }
}