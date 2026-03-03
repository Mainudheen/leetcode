class Solution {
    public int maximumCount(int[] nums) {
        int pos = nums.length - binarysearch(nums,1);
        int neg = binarysearch(nums,0);
        return Math.max(pos,neg);
    }
    public int binarysearch(int[] nums,int target){
        int low = 0;
        int high = nums.length-1;
        int result = nums.length;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid] < target){
                low = mid+1;
            }else{
                result = mid;
                high = mid-1;
            }
        }
        return result;
    }
}