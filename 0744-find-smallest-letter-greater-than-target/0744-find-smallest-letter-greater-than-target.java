class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ans = letters[0];
        int tar = target-'0';
        for(int i=0;i<letters.length;i++){
            int num = letters[i] - '0';
            if(num > tar){
                return letters[i];
            }
        }
        return ans;
    }
}