class Solution {
    public int balancedStringSplit(String s) {
        int left = 0;
        int right = 0;
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L'){
                left++;
            }else{
                right++;
            }
            if(left == right){
                count++;
                left = 0;
                right = 0;
            }
        }
        return count;
    }
}