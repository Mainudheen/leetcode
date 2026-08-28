class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
         k = k%n;

        rot(nums,0,n-1);
        rot(nums,0,k-1);
        rot(nums,k,n-1);
    }
    public void rot(int[] nums,int st,int ed){
        while(st <= ed){
            int temp = nums[st];
            nums[st] = nums[ed];
            nums[ed] = temp;
            st++;
            ed--;
        }
    }
}