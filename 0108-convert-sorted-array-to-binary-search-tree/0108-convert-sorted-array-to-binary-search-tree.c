/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
struct TreeNode* build(int* nums,int left,int right){
    if(left>right) return NULL;

    int mid = (left+right)/2;
    struct TreeNode* newNode = (struct TreeNode*)malloc(sizeof(struct TreeNode));
    newNode->val = nums[mid];
    newNode->left = build(nums,left,mid-1);
    newNode->right = build(nums,mid+1,right);
    return newNode;
}
struct TreeNode* sortedArrayToBST(int* nums, int numsSize) {
    return build(nums,0,numsSize-1);
}