class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        int left = 0;
        
        int k = p.length();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < p.length(); i++) {
            freq1[p.charAt(i) - 'a']++;
        }
        for(int right =0;right<s.length();right++){
            freq2[s.charAt(right)-'a']++;
            if((right-left+1)>k){
                freq2[s.charAt(left)-'a']--;
                left++;
            }
            if((right-left+1)==k){
                if(Arrays.equals(freq1,freq2))list.add(left);
            }
        }
        return list;
    }
}