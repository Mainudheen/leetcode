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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return new ArrayList<>();
        }
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            Stack<Integer> st = new Stack<>();
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
                st.push(curr.val);
                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
            }
            while(!st.isEmpty()){
                arr.add(st.pop());
                st.clear();
            }
        }
        return arr;
    }
}