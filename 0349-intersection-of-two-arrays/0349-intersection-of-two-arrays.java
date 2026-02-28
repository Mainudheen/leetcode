class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if(!map.containsKey(nums1[i])){
                map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])){
                if(!set.contains(nums2[i])){
                    set.add(nums2[i]);
                    list.add(nums2[i]);
                }
            }
        }
        int[] res = new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }
}