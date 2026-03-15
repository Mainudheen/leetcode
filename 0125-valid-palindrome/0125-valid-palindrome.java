class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                str+=(char)(s.charAt(i)+32);
            }else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                str+=s.charAt(i);
            }else if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                str+=s.charAt(i);
            }
        }
        
        int left = 0;
        int right= str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}