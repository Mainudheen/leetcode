class Solution {
    public int majorityElement(int[] nums) {
        int res = 0;
        int maj = 0;
        for(int n:nums){
            if(maj == 0){
                res = n;
            }
            maj+=n == res ? 1:-1;
        }
        return res;
    }
}