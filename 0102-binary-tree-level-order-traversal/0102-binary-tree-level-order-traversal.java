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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<List<Integer>> list = new ArrayList<>();
        if(root == null) return new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> arr = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
               int value = curr.val;
               arr.add(value);
                if(curr.left!=null){
                    q.offer(curr.left);
                    
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                    
                }
            }
           list.add(arr);
        }
        return list;
    }
}