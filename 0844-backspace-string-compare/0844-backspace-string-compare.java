class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sb1 = new Stack<>();
        Stack<Character> sb2 = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != '#'){
                sb1.push(s.charAt(i));
            }
            else{
           
                if(!sb1.isEmpty()){
                    sb1.pop();
                }
            }
            
           
        }
        for(int i=0;i<t.length();i++){
            
            if(t.charAt(i)!='#'){
                sb2.push(t.charAt(i));
            }
            else{
                if(!sb2.isEmpty()){
                    sb2.pop();
                }
            }
        }
        if(sb1.size() != sb2.size()){
            return false;
        }
        while(!sb1.isEmpty()){
            char s1 = sb1.pop();
            char s2 = sb2.pop();
            if(s1 != s2){
                return false;
            }
        }
        return true;
    }
}