class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String[] ans = new String[words.length];
        int n = words.length;
        for(int i=0;i<words.length;i++){
            String str = words[i];
            String word = "";
           for(int j=0;j<str.length();j++){
                if(str.charAt(j)!= ' '){
                    word+=str.charAt(j);
                }
           }
           if (!word.isEmpty()) {
                ans[--n] = word;
            }
        }
        String res = "";
        for(int i=0;i<ans.length;i++){
            if(ans[i]!=null){
                if(!res.isEmpty()){
                    res+=" ";
                }
                res+=ans[i];
            }
        }
        
        return res;
    }
}