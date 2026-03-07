class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90){
                str += (char)(s.charAt(i)+32);
            }else if((s.charAt(i)>=97 && s.charAt(i)<=122)||s.charAt(i)>='0'&& s.charAt(i)<='9'  ){
                str+=s.charAt(i);
            }
        }
        int left = 0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left)==str.charAt(right)){
                left++;
                right--;
            }
           else{
            return false;
           }
        }
        System.out.print(str);
        return true;
    }
}