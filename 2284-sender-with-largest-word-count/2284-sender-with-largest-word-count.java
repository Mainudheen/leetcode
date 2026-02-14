class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<senders.length;i++){
            String words[] = messages[i].split(" ");
            map.put(senders[i],map.getOrDefault(senders[i],0)+words.length);
        }
        int max = 0;
        String res = "";
        for(Map.Entry<String,Integer> e:map.entrySet()){
            if(e.getValue() > max || e.getValue()==max && e.getKey().compareTo(res)>0){
                max = e.getValue();
                res = e.getKey();
            }
        }
        return res;
    }
    
    
}