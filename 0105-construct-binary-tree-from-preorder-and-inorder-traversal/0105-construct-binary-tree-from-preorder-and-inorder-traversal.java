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
    int idx = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return check(preorder,map,0,inorder.length-1);
    }
    public TreeNode check(int[] preorder,HashMap<Integer,Integer> map,int st,int end){
        if(st > end) return null;
        int val = preorder[idx++];
        TreeNode node = new TreeNode(val);
        int index = map.get(val);

        node.left = check(preorder,map,st,index-1);
        node.right = check(preorder,map,index+1,end);
        return node;

    }
}