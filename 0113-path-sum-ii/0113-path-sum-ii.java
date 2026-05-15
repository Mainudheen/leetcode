/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int sum = 0;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        check(root,list,arr,targetSum);
        return list;
    }
    public void check(TreeNode root,List<List<Integer>> list,List<Integer> arr,int target){
        if(root == null)return;

        sum+=root.val;
        arr.add(root.val);

        if(root.left == null && root.right == null){
            if(target == sum){
                list.add(new ArrayList<>(arr)); 
            }
            
        }
        check(root.left,list,arr,target);
        check(root.right,list,arr,target);
        arr.remove(arr.size()-1);
        sum-=root.val;
        
    }
}