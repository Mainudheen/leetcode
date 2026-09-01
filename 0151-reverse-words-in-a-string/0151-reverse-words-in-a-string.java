class Solution {
    public String reverseWords(String s) {
        String str[] = s.split(" ");
        int n = str.length;
        String res = "";
        for(int i=n-1;i>=0;i--){
            res += str[i];
            res = res.trim();
            if(i!=0){
                res+=" ";
            }
        }
        return res;
    }
}