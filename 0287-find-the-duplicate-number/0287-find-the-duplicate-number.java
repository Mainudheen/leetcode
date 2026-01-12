class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n:nums){
            if(map.containsKey(n)){
                return n;
            }else{
            map.put(n,map.getOrDefault(n,0)+1);
            }
        }
        return 0;
    }
}