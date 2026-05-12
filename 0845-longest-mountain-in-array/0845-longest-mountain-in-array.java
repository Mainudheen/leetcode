class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int longest = 0;
        int i=1;
        while(i < n-1){
            boolean isPeak = arr[i] > arr[i-1] && arr[i] > arr[i+1];
            if(!isPeak){
                i++;
                continue;
            }
            int left = i-1;

            while(left > 0 && arr[left] > arr[left-1]){
                left--;
            }
            int right = i+1;
            while(right < n-1 && arr[right] > arr[right+1]){
                right++;
            }
            int peak = right - left + 1;
            longest = Math.max(longest,peak);
            i=right;
        }
        return longest;
    }
}