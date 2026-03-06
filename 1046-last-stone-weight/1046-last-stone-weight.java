class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<stones.length;i++){
            pq.offer(stones[i]);
        }
        while(pq.size()>1){
            int x = pq.poll();
            int y = 0;
            if(!pq.isEmpty()){
                 y = pq.poll();
            }
            int ans = 0;
            if(x==y){
                continue;
            }else if(y<x){
                y = x-y;
                pq.offer(y);
            }
        }
        if(!pq.isEmpty()){
            return pq.poll();
        }else{
            return 0;
        }
    }
}