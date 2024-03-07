/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* middleNode(ListNode* head) {
        ListNode *tmp = head;

        int cnt = 0;
        int i = 0;

        while(head != NULL){
            ++cnt;

            if(cnt / 2 > i){
                ++i;
                tmp = tmp->next;
            }

            head = head->next;
        }

        return tmp;
    }
};