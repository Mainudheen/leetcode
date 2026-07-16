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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null)return new ArrayList<>();
        q.offer(root);
        int count = 1;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> list1 = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
               
               
                list1.add(curr.val);
                
                if(curr.left != null){
                    q.offer(curr.left);
                }
                if(curr.right != null){
                    q.offer(curr.right);
                }
            }
            if(count%2 == 0){
                Collections.reverse(list1);
            }
            list.add(list1);
            count++;
        }
        return list;
    }
}