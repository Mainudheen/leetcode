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
        
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        Stack<Integer> st = new Stack<Integer>();
        q.offer(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
                if(curr!=null){
                    int num = curr.val;
                    st.push(num);
                }
                
                if(curr!=null && curr.left != null){
                    q.offer(curr.left);
                    
                }
                if(curr!=null && curr.right!=null){
                    q.offer(curr.right);
                    
                }
               
            }
            while(!st.isEmpty()){
                list.add(st.pop());
                st.clear();
            }
            
            
        }
        return list;
    }
}