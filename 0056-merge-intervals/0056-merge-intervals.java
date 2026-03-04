

class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

        int[][] arr = new int[intervals.length][2];

        int left = 0;
        arr[0] = intervals[0];

        for(int right=1; right<intervals.length; right++){

            if(arr[left][1] >= intervals[right][0]){
                arr[left][1] = Math.max(arr[left][1], intervals[right][1]);
            }
            else{
                left++;
                arr[left] = intervals[right];
            }
        }

        return Arrays.copyOf(arr, left+1);
    }
}