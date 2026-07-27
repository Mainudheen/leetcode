class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        int max = 0;
        for(int i=0;i<s.length();i++){
            int even = help(s,i,i+1);
            int odd = help(s,i,i);
            max = Math.max(even,odd);

            if(max > end-start){
                start = i - (max - 1)/2;
                end = i + (max)/2;
            }
        }
        return s.substring(start,end+1);
        
    }
    public int help(String s,int l,int r){
        while(l >=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
}