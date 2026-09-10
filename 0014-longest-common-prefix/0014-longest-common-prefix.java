class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        if(strs.length == 1){
            return s;
        }
        int i = 1;
        int min = Integer.MAX_VALUE;
        int left = 0;
        while(i<strs.length){
            left = 0;
            String str = strs[i];
            int right = 0;
            while(left <= right && left<s.length() && right < str.length() && s.charAt(left) == str.charAt(right)){
                left++;
                right++;
            }
            min = Math.min(min,left);
            i++;
        }
        if(min == 0 || min == Integer.MAX_VALUE){
            return "";
        }
        return s.substring(0,min);
    }
}