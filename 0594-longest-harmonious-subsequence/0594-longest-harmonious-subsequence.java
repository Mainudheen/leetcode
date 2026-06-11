class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++){
            int value = nums[i];
            int count = 0;
            if(map.containsKey(value)){
                
                if(map.containsKey(value+1)){
                    count+= map.get(value);
                    count+=map.get(value+1);
                }
            }
            max = Math.max(count,max);
        }
        return max;
    }
}