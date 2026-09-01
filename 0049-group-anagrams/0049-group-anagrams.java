class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<List<Integer>,List<String>> map = new HashMap<>();
        for(String s:strs){

            int[] freq = new int[26];
            for(int i=0;i<s.length();i++){
                freq[s.charAt(i)-'a']++;
            }
            List<Integer> key = new ArrayList<>();
            for(int c:freq){
                key.add(c);
            }
            map.computeIfAbsent(key,k->new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}