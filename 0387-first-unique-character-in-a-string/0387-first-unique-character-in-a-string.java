class Solution {
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++){
            boolean have = false;
            for(int j=0;j<s.length();j++){
                if(i!=j && s.charAt(i) == s.charAt(j)){
                    have = true;
                    break;
                }
            }
            if(!have){
                return i;
            }
        }
        return -1;
    }
}