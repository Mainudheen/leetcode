class Solution {
    public int missingNumber(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(count!=nums[i]){
                return count;
            }else{
                count++;
            }
        }
        return nums[nums.length-1]+1;
    }
}