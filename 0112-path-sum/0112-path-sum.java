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
    boolean ans = false;
    int sum = 0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        check(root,targetSum);
        return ans;
    }
    public void check(TreeNode root,int total){
        if(root == null)return;
        sum+=root.val;
        if(root.left == null && root.right==null){
            if(sum == total){
                ans = true;
            }
        }
        check(root.left,total);
        check(root.right,total);
        sum -= root.val;
    }
}