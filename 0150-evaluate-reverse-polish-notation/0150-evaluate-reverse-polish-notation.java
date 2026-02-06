class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String str = tokens[i];
            if(str.equals("+")){
                st.push(st.pop()+st.pop()); 
            }else if(str.equals("-")){
                int second = st.pop();
                int first = st.pop();
                st.push(first - second);
            }else if(str.equals("*")){
                st.push(st.pop()*st.pop());
            }else if(str.equals("/")){
                int second = st.pop();
                int first = st.pop();
                st.push(first / second);
            }else{
            st.push(Integer.parseInt(str));
            }
        }
        return st.peek();
    }
}