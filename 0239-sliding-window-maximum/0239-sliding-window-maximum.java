class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int idx = 0;
        int[] res = new int[nums.length-k+1];
        Deque<Integer> d = new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];

            while(!d.isEmpty() && d.getLast() < num){
                d.pollLast();
            }
            d.addLast(num);
            if(i>=k && nums[i-k] == d.getFirst()){
                d.pollFirst();
            }
            if(i>=k-1){
                res[idx++] = d.getFirst();
            }
        }
        return res;
    }
}