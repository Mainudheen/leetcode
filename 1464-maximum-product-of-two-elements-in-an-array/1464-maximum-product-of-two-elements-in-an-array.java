class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        for(int i=0;i<nums.length-1;i++){
            int res = 0;
            for(int j=i+1;j<nums.length;j++)
            {
                res = (nums[i]-1)*(nums[j]-1);
                max = Math.max(max,res);
            }
        }  
        return max;
    }
}