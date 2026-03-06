class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Queue<int[]> pq = new PriorityQueue<>((a,b)->b[1]-a[1]);
        int[][] res = new int[k][2];
        for(int i=0;i<points.length;i++){
            int dist = points[i][0]*points[i][0] +
                       points[i][1]*points[i][1];
            pq.offer(new int[]{i,dist});
            while(pq.size()>k){
                pq.poll();
            }

        }
        int rank = 0;
        while(!pq.isEmpty()){
            int[] num = pq.poll();
            int idx = num[0];
    
            res[rank][0] = points[idx][0];
            res[rank][1] = points[idx][1];
            rank++; 
        }
        return res;
    }
}