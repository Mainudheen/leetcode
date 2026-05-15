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
    int index;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        index = postorder.length-1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return helper(postorder,map,0,inorder.length-1);

    }
    public TreeNode helper(int[] postorder,HashMap<Integer,Integer> map,int start,int end){
        if(start > end)return null;

        
        int val = postorder[index--];
        

        TreeNode node = new TreeNode(val);
        int idx = map.get(val);
        
         node.right = helper(postorder,map,idx+1,end);
        node.left = helper(postorder,map,start,idx-1);
       
        
        return node;
    }
}