class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<knowledge.size();i++){
            String key = knowledge.get(i).get(0);
            String val = knowledge.get(i).get(1);
            map.put(key,val);
        }
        Stack<String> st = new Stack<>();
        //boolean isFound = false;
        int left = 0;
        while(left < s.length()){
            
            String str = "";
            int right = left+1;
            boolean isFound = false;
            while(s.charAt(left) == '(' && right < s.length()){
                if(s.charAt(right) != ')'){
                    str += s.charAt(right);
                    right++;
                }else if(s.charAt(right) >= 97 && s.charAt(right)<=122){
                    str += s.charAt(right);
                    right++;
                }else{
                    st.push(str);
                    isFound = true;
                    break;
                }
                
                
            }
            if(str != "" && map.containsKey(str)){
                String value = map.get(str);
                sb.append(value);
            }else if(str != ""){
                sb.append("?");
            }
            else{
                if(left < s.length()){
                    sb.append(String.valueOf(s.charAt(left)));
                }
            }
           
            if(isFound){
                left = right+1;
            }else{
            left++;
            }
        }
        
        return sb.toString();
    }
}