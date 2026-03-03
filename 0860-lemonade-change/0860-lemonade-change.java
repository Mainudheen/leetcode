class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int five = 0;
        int ten = 0;
        int left = 0;
        while(left < bills.length){
            if(bills[left]==5){
                five++;
            }
            else if(bills[left]==10){
                ten++;
                if(five>0)five--;
                else return false;
            }
            else{
                if(ten>0 && five>0){
                    five--;
                    ten--;
                }
                else if(five>=3){
                    five-=3;
                }else{
                    return false;
                }
            }
            left++;
        }
        return true;
    }
}