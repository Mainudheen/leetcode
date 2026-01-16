class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = height.length-1;
        int min = Integer.MAX_VALUE;
        int max = 0;
        int ans = 0;
        while(left<right){
            if(height[left] < height[right]){
              // max = Math.max(height[left],height[right]);
                int value = right - left;
               ans = height[left] * value;
               max = Math.max(max,ans);
               left++;
            }else if(height[left] > height[right]){
                int value = right - left;
                ans = height[right] * value;
                max = Math.max(max,ans);
                right--;
            }else{
                int value = Math.abs(left-right);
                ans = height[left] * value;
                max = Math.max(max,ans);
                left++;
                right--;
            }
        }
        return max;
    }
}