class Solution {
    public int singleNumber(int[] nums) {
        int k = 0;
        for(int n:nums){
            k = k ^ n;
        }
        return k;
    }
}