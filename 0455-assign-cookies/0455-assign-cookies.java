class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int p = g.length;
        int c = s.length;
        int left = 0;
        int right = 0;
        while(left<c && right<p){
            if(s[left]>=g[right]){
                right++;
                left++;
            }
            else{
                left++;
            }
        }
        return right;
    }
}