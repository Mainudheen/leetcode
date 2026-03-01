class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int max = 0;
        for(int left=0;left<s.length();left++){
            int right = left;
            HashMap<Character,Integer> map = new HashMap<>();
            while(right<s.length()){
                if(!map.containsKey(s.charAt(right))){
                    map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
                }else{
                    
                    break;
                }
                right++;
            }
            max = Math.max((right-left),max);
        }
        return max;
    }
}