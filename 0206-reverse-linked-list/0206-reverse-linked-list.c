/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
   struct ListNode* curr = head;
   struct ListNode* prev = NULL;
   struct ListNode* temp = NULL;
   while(curr!=NULL){
        temp = curr->next;
        curr->next = prev;
        prev = curr;
        curr = temp;
   } 
   return prev;
}