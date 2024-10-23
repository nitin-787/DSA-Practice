#include <bits/stdc++.h>
using namespace std;
#define null nullptr
struct node {
    int data;
    node *next;
    node *prev;
};

node *head = new node{0,null};

// print element of the linked list
void print_all() {
    if (head == null) {
        cout << "List is empty" << endl;
        return;
    }
    node *temp = head;
    cout << "Printing all the nodes ";
    do {
        cout << temp->data << " ";
        temp = temp->next;
    } while (temp != head); 
    cout << endl;
}

int main () {
    node *current = head;
    head->data = 1;
    
    // create a circular linked list with 5 nodes
    for (int i = 2; i <= 5; ++i) {
        current->next = new node{i, null};
        current->next->prev = current;
        current = current->next;
    }

    // make the linked list circular
    current->next = head;
    head->prev = current;

    print_all();
    return 0;
}