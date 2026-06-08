class Solution {
    public int[] rearrangeArray(int[] nums) {
        int left = 0;
        int right = 1;
        int n = nums.length;
        int[] arr = new int[n];
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0){
                arr[left] = nums[i];
                left+=2;
            }
            else if(nums[i] < 0){
                arr[right] = nums[i];
                right+=2;
            }
            
        }
        return arr;
    }
}