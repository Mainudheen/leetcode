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
    int index = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return helper(preorder,map,0,inorder.length-1);

    }
    public TreeNode helper(int[] preorder,HashMap<Integer,Integer> map,int start,int end){
        if(start > end)return null;

        int val = preorder[index++];
        TreeNode node = new TreeNode(val);

        int idx = map.get(val);

        node.left = helper(preorder,map,start,idx-1);
        node.right = helper(preorder,map,idx+1,end);

        return node;
    }
}