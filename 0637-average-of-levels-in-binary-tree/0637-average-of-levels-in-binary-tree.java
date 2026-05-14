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
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            long sum = 0;
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
                sum+=curr.val;
                
                if(curr.left!=null){
                    q.offer(curr.left);
                    //sum+=curr.left.val;
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                    //sum+=curr.right.val;
                }
            }
            double value = (double) sum/size;
            list.add(value);
        }
        return list;
    }
}