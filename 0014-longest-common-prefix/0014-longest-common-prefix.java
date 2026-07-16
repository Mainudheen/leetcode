class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        int left = 0;
        int i = 1;
        int max = s.length();
        while(i < strs.length){
            String str = strs[i];
            while(left < str.length() && left < s.length() && s.charAt(left) == (str.charAt(left))){
                left++;
            }
            max = Math.min(max,left);
            i++;
            left = 0;
        }
        return s.substring(0,max);
    }
}