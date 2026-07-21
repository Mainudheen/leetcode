class Solution {
    public String decodeMessage(String key, String message) {
        String k = key.replaceAll("\\s+","");
        HashMap<Character,Character> map = new HashMap<>();
        int num = 97;
        for(int i=0;i<k.length();i++){
            if(!map.containsKey(k.charAt(i))){
                map.put(k.charAt(i),(char)num++);
            }
        }
        String s = "";
        for(int i=0;i<message.length();i++){
            if(map.containsKey(message.charAt(i))){
                s+=map.get(message.charAt(i));
            }else{
                s+=" ";
            }
        }
        return s;
    }
}