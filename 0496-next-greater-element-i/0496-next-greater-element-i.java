class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int num = nums1[i];
            boolean isValid = false;
            int max = 0;
            ans[i] = -1;
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==num){
                    isValid = true;
                }
                else if(isValid == true && nums2[j]>num){
                    ans[i] = nums2[j];
                    break;
                }
                
            }
        }
        return ans;
    }
}