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
    while (temp != null) {
        cout << temp->data << " " ;
        temp = temp->next;
    }
    cout << endl;
}

// delete a node with data x
void del_with_data(int x) {
    if (head == null) {
        cout << "list is empty" << endl;
        return;
    }

    // data is in the starting
    if (head->data == x) {
        node *temp = head;
        head = head->next;
        head->prev = null;
        return;
    }

    node *temp = head;
    while (temp->data != x) {
        temp = temp->next;

        // data is in the last
        if (temp->next == null && temp->data == x) {
            temp->prev->next = null;
            delete temp;
            return;
        }

        // data is in the middle
        if (temp->data == x) {
            temp->prev->next = temp->next;
            temp->next->prev = temp->prev;
            delete temp;
            return;
        }
    }
}

int main () {
    head->data = 1;
    head->prev = null;
    node* current = head;

    for (int i = 2; i <= 5; ++i) {
        current->next = new node{i, null};
        current->next->prev = current;
        current = current->next;
    }


    print_all();
    del_with_data(5);
    print_all();
    return 0;
}