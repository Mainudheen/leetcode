class Solution {
    public String reversePrefix(String word, char ch) {
        int i = 0;
        String str = "";
        boolean valid = false;
        while(i < word.length()){
            if(valid == true){
                str+=word.charAt(i);
            }
            if(word.charAt(i) == (ch) && valid == false){
                str += reverse(word,i);
                valid = true;
            }
            
            i++;
        }
        if(valid == false){
            return word;
        }
        return str;
    }
    public String reverse(String s,int end){
        String str = "";
        while(end >= 0){
            str+=s.charAt(end);
            end--;
        }
        System.out.println(str);
        return str;
    }
}