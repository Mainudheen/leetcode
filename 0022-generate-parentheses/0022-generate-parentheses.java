class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        help(list,n,0,0,"");
        return list;
    }
    public void help(List<String> list,int n,int open,int close,String p){
        if(p.length() == (2*n)){
            list.add(p);
            return;
        }
        if(open < n){
            help(list,n,open+1,close,p+"(");
        }
        if(close < open){
            help(list,n,open,close+1,p+")");
        }
    }
}