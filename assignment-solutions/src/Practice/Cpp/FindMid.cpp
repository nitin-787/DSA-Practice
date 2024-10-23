#include <bits/stdc++.h>
using namespace std;
#define endl '\n'
#define null nullptr
#define FOR(i,a,b) for(int i=(a); i<(b); i++)


class Solution {
public:
    struct node {
        int data;
        node *next;
};
    node *head = new node;
    
    node* findMid(node* head) {
        if (head == null || head->next == null) {
            return head;
        }

        node* temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp->next;
        }

        int mid = count / 2 + 1;
        temp = head;

        while (temp != null) {
            mid--;
            if (mid == 0) {
                break;
            }
            temp = temp->next;
        }
        return temp;
        
    }
};

int main () {
    Solution sol;
    Solution::node * current = sol.head;

    FOR(i, 2, 5) {
        current->next = new Solution::node{i, null};
        current = current->next;

    }

    Solution::node* midNode = sol.findMid(sol.head);
    cout << "mid : " << midNode->data << endl;
    return 0;
}