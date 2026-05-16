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

        if(root == null){
            return list;
        }

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        boolean leftToRight = true;

        while(!q.isEmpty()){

            int size = q.size();

            LinkedList<Integer> arr = new LinkedList<>();

            for(int i=0;i<size;i++){

                TreeNode curr = q.poll();

                if(leftToRight){
                    arr.addLast(curr.val);
                }
                else{
                    arr.addFirst(curr.val);
                }

                if(curr.left != null){
                    q.offer(curr.left);
                }

                if(curr.right != null){
                    q.offer(curr.right);
                }
            }

            list.add(arr);

            leftToRight = !leftToRight;
        }

        return list;
    }
}