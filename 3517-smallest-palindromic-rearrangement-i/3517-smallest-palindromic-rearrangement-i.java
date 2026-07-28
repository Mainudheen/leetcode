class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        char ch[] = new char[s.length()];
        int left = 0;
        int right = s.length()-1;
        for(int i=0;i<26;i++){
                while(freq[i] >= 2){
                        ch[left++] = (char)(i + 'a');
                        ch[right--] = (char)(i + 'a');
                        freq[i]-=2;
                }
        }
       for(int i=0;i<26;i++){
            if(freq[i]==1){
                ch[left++] = (char)(i+'a');
            }
       }
    return new String(ch);
    }
}