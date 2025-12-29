class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();
        int window = p.length();
        int[] freq = new int[26];
        
        for(int i=0;i<p.length();i++){
            freq[p.charAt(i)-'a']++;
        }
        for(int i=0;i<=s.length()-window;i++){
            if(check(s,freq,i,i+window)){
                list.add(i);
            }
        }
        return list;
    }
    public static boolean check(String s,int[] freq,int start,int end){
        int[] freq2 = new int[26];
        for(int i=start;i<end;i++){
            freq2[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=freq2[i]){
                return false;
            }
        }
        return true;
    }
}