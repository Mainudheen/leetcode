class Solution {
    public String largestOddNumber(String num) {
        int n = num.length()-1;
        String s = "";
        for(int i=n;i>=0;i--){
            int val = Integer.parseInt(String.valueOf(num.charAt(i)));
            System.out.println(val);
            if(val % 2!=0){
                s = num.substring(0,i+1);
                return s;
            }
        }
        return s;
    }
}