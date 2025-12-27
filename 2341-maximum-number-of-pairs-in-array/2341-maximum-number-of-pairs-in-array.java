class Solution {
    public int[] numberOfPairs(int[] nums) {
        int p = 0;
        int left = 0;
        int c[] = new int[101];
        for(int n:nums){
            c[n]++;
        }
        for(int i:c){
            p+=i/2;
            left+=i%2;
        }
        return new int[]{p,left};
    }
}