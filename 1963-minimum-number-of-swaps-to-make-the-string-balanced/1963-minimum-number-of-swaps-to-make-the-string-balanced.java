class Solution {
    public int minSwaps(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else if(!st.isEmpty() && st.peek()=='[' && s.charAt(i)==']'){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        if(st.isEmpty()){
            return 0;
        }
        return (st.size()/2+1)/2;
    }
}