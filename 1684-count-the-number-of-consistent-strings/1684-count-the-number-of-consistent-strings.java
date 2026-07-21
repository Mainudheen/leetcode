class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashMap<Character,Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0;i<allowed.length();i++){
            map.put(allowed.charAt(i),map.getOrDefault(allowed.charAt(i),0)+1);
        }
        int j = 0;
        while(j < words.length){
            String str = words[j];
            boolean valid = false;
            for(int i=0;i<str.length();i++){
                if(!map.containsKey(str.charAt(i))){
                    valid = true;
                }
            }
            if(!valid){
                count++;
            }
            j++;
        }
        return count;
    }
}