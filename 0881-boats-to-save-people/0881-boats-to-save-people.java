class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int boat = 0;
        int right = people.length-1;
        while(left<=right){
            int sum = people[left] + people[right];
            if(left == right){
                boat++;
                break;
            }
            if(sum == limit){
                boat++;
                left++;
                right--;
            }else if(sum > limit){
                boat++;
                right--;
            }else{
                boat++;
                left++;
                right--;
            }
            
        }
        return boat++;
    }
}