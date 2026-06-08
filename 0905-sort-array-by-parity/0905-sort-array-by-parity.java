class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int arr[] = new int[n];
                for(int i=0;i<n;i++){
            if(nums[i]%2 == 0){
                arr[left++] = nums[i];
            }else{
                arr[right--] = nums[i];
            }
        }
        return arr;
    }
}