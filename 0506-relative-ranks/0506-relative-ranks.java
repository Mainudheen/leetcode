class Solution {
    public String[] findRelativeRanks(int[] score) {
        String res[] = new String[score.length];
        Queue<int[]> pq = new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(int i=0;i<score.length;i++){
            pq.offer(new int[]{i,score[i]});
        }
        int count = 1;
        while(!pq.isEmpty()){
            int[] num= pq.poll();
            int idx = num[0];
            int number = num[1];
            
                if(count == 1){
                    res[idx] = "Gold Medal";
                } else if(count == 2){
                    res[idx] = "Silver Medal";
                }else if(count == 3){
                    res[idx] = "Bronze Medal";
                }
                
            
            else{
                res[idx] = String.valueOf(count);
                
            }
            count++;
        }
        return res;
    }
}