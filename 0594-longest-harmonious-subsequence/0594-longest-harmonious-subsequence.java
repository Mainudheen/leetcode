class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>();
        //PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max = 0;
        for(int i=0;i<nums.length-1;i++){
            int value = Math.abs(nums[i]-nums[i+1]);
            if(value == 1){
                int num1 = map.get(nums[i]);
                int num2 = map.get(nums[i+1]);
                int add = num1+num2;
                max = Math.max(add,max);
            }
        }
        return max;
    }
}