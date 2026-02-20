class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for(int i=0;i<nums.length;i++){
        
           if(i<nums.length-2 && nums[i]!=nums[i+2]){
                nums[k++] = nums[i];
           }else if(i>=nums.length-2){
            nums[k++] = nums[i];
           }
        }
        return k;
    }
}