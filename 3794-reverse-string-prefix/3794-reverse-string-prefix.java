class Solution {
    public String reversePrefix(String s, int k) {
        int left = 0;
        int right = 0;
        String str = "";
        boolean isValid = true;
        while(right<s.length()){
            if((right+1)==k){
                left = right+1;
                while(right!=-1){
                     str+=s.charAt(right);
                     right--;
                } 
                while(left<s.length()) {
                    str+=s.charAt(left);
                    left++;
                } 
                isValid = false;
            }
            if(isValid==false){
                break;
            }
            right++;

        }
        return str;
    }
}